package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		new Microwave();
		String flavor = JOptionPane.showInputDialog("what flavor of popcorn would you like to make?");
		Microwave.putInMicrowave(new Popcorn(flavor));
		String time = JOptionPane.showInputDialog("how many minutes would you like to microwave your popcorn for?");
		int min = Integer.parseInt(time);
		Microwave.setTime(min);
		Microwave.start();
		Popcorn.eat();
	}
}
