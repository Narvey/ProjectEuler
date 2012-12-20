package gui;

import java.awt.FlowLayout;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import problems.Prob1;
import problems.Prob2;
import problems.Prob3;

public class Win extends JFrame {
	private static Win instance = null; 
	public JTextField result;
	private Win(){
		super();
		this.setTitle("Project Euler projects");
		this.setLayout(new FlowLayout());
		this.setSize(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton prob1 = new JButton((Action) new MyAction(new Prob1()));
		prob1.setText("Problem 1");
		add(prob1);
		JButton prob2 = new JButton((Action) new MyAction(new Prob2()));
		prob2.setText("Problem 2");
		add(prob2);
		JButton prob3 = new JButton((Action) new MyAction(new Prob3()));
		prob3.setText("Problem 3");
		add(prob3);
		result = new JTextField();
		add(result);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Win window = getInstance();
	}

	public static Win getInstance() {
		if(instance==null)instance = new Win();
		return instance;
	}

}
