package pl.sp.server;

public class Main {

	public static void main(String[] args) {

		GUI gui = new GUI();
		Server server = new Server();
	

		while (gui.isZakoncz() == true) {
			
			server.listen();
			gui.jtextfield.setText(server.getText());
		}
		
		

	}

}
