package _07_fortune_cookie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	 public void showButton() {
           frame.setVisible(true);
           frame.add(button);
           frame.pack();
           button.addActionListener(this);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "WooHoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will have good luck for the next week.");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will have bad luck for the next week.");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Will happen something good.");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Will happen something extremely good.");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Darkness I forsee.");
		}
		} 
			
		}
		
	
    

