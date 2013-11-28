import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingObserverExam {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExam example = new SwingObserverExam();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		frame.setVisible(true);
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		//
	}
	
	class AngelListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it, you might regret it!");
		}
	}
	
	class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it!");
		}
	}
}
