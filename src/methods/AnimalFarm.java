package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
String animal=JOptionPane.showInputDialog("what animal so you want to hear?");
if (animal.equals("cow")) {
JOptionPane.showMessageDialog(null, mooFile);
playMoo();
playMoo();
}
if (animal.equals("duck")) {
JOptionPane.showMessageDialog(null, quackFile);
playQuack();
playQuack();
}
if (animal.equals("llama")) {
JOptionPane.showMessageDialog(null, llamaFile);
playLlama();
playLlama();
}
}

private void playLlama() {
	playNoise(llamaFile);
	// TODO Auto-generated method stub
	
}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

