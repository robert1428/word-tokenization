package fds;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI1 extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private TextField text1;
	private TextField text2;
	private JButton adaugare;
	private JButton adaugare1;

	public GUI1() {
		super("Titlu");
		setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		text1 = new TextField(10);
		label1 = new JLabel("<html>Nume<br></html>");
		label2 = new JLabel("Varsta");
		text2 = new TextField(10);
		adaugare = new JButton("Adaugare");
		add(label1);
		add(text1);
		add(label2);
		add(text2);
		add(adaugare);

	}

}
