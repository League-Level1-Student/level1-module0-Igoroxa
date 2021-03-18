package _08_jack_in_the_box;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Suprise implements ActionListener {
	int amount = 0;
public static void main(String[] args) {
	
	JFrame jack = new JFrame();
	JButton button = new JButton();
	Suprise s = new Suprise();
	s.setup();
}

void setup() {
	JFrame jack = new JFrame();
	JButton button = new JButton();
	jack.setVisible(true);
	jack.add(button);
	Dimension BIG = new Dimension(400, 400);
	button.setPreferredSize(BIG);
	button.setText("Suprise");
	button.addActionListener(this);
	
}

private void showPicture(String fileName) { 
    try {
         JLabel imageLabel = createLabelImage(fileName);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

private JLabel createLabelImage(String fileName) {
    try {
         URL imageURL = getClass().getResource(fileName);
         if (imageURL == null) {
              System.err.println("Could not find image " + fileName);
              return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
         }
    } catch (Exception e) {
         System.err.println("Could not find image " + fileName);
         return new JLabel();
    }













}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub

amount = amount + 1;
if (amount == 5) {
	showPicture("jackInTheBox.png");
}
}
}
