package pl.sp.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

	// private JFrame jframe;
	private JPanel jpanel;
	public JTextField jtextfield;
	private JButton jbutton;
	private JLabel jlabel;
	private boolean zakoncz = true;

	GUI() {

		this.jpanel = new JPanel();
		this.jtextfield = new JTextField(20);
		this.jbutton = new JButton("Zakoñcz");
		jbutton.addActionListener(this);
		this.jlabel = new JLabel();
		jpanel.add(jtextfield);
		jpanel.add(jbutton);
		jpanel.add(jlabel);
		setTitle("Serwer UDP");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		add(jpanel);
		setVisible(true);

	}

	public boolean isZakoncz() {
		return zakoncz;
	}

	public void setZakoncz(boolean zakoncz) {
		this.zakoncz = zakoncz;
	}

	public void actionPerformed(ActionEvent e) {
		this.zakoncz = false;
		jlabel.setText("serwer zakoñczy³ pracê");
		

	}

}
