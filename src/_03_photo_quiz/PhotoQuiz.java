package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String image = "https://blog.hubspot.com/hubfs/image8-2.jpg";
		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component
		Component imageComp = createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(imageComp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Is this a logo?");
		// 7. print "CORRECT" if the user gave the right answer
if (question.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "You got it correct");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(imageComp);
		// 10. find another image and create it (might take more than one line
		// of code)
String imagetwo = "https://i.pinimg.com/originals/de/1c/91/de1c91788be0d791135736995109272a.png";
Component imageComptwo = createImage(imagetwo);
		// 11. add the second image to the quiz window

quizWindow.add(imageComptwo);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String two = JOptionPane.showInputDialog("Is this the youtube logo?");
		// 14+ check answer, say if correct or incorrect, etc.
if (two.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "You got it correct");
}
		
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
