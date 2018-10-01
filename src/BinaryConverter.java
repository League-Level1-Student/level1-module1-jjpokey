import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener  {

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField field = new JTextField(20);
JLabel label = new JLabel();
JButton button = new JButton();


 void setup() {
	frame.add(panel);
	panel.add(field);
	panel.add(label);
	panel.add(button);
	button.addActionListener(this);
	panel.setName("Binary Converter");
	button.setText("Convert");
	label.setText("A");
	frame.setSize(350, 100);
	frame.setTitle("Binary Converter");
	frame.show();

	
}
public static void main(String[] args) {
new BinaryConverter().setup();
}

String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
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
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		String w = field.getText();
		label.setText(convert(w));
		
		
	}
	
}
}
