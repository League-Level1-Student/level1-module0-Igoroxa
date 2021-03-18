package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;

public class soundMachine implements ActionListener {
public static void main(String[] args) {
	soundMachine sm = new soundMachine();
	sm.setup();
}

void setup() {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	frame.pack();
	button.setText("Sound Effect");
	button.addActionListener(this);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

private void playSound(String soundFile) {
	String path = "src/_09_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	playSound("sawing-wood-daniel_simon.wav");
}
}
