package _07_binary_converter;



import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

public BinaryConverter() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	JTextField text = new JTextField(20);
	button.setText("covert");
	JPanel panel= new JPanel();
	JLabel label = new JLabel();
	label.add(text);
	panel.add(text);
	panel.add(button);
	frame.add(panel);
	frame.pack();
	JTextField input = text;
}
public void mouseClicked(MouseEvent e) {
	convert(text);
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

}                              

