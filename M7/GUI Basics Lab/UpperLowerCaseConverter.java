/***************************************
 * CSCI 185 M05 Spring 2022
 * Shreya Shukla
 * M7: GUI Basics Lab
 * 4/19/2022
****************************************/
import java.awt.*;
import javax.swing.*;
public class UpperLowerCaseConverter extends JFrame{
	public UpperLowerCaseConverter () {
		super ("Uppercase and Lowercase Converter");
		setLocation (100,100);
		setSize (480, 220);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//create a label with text "Enter your text: "
		JLabel jlblName = new JLabel("Enter your text: ");
		add (jlblName, BorderLayout.WEST);
		//create a text field with text "Type text here: "
		JTextField jtfName = new JTextField("");
		add (jtfName, BorderLayout.CENTER);
		//create a button with text "Submit"
		JButton jbtSubmit = new JButton("Submit");
		add (jbtSubmit, BorderLayout.EAST);
		//create a combo box with choices UpperCase, LowerCase
		JComboBox jcboColor = new JComboBox (new String [] {"Convert to uppercase", "Convert to lowercase"});
		add (jcboColor, BorderLayout.SOUTH);
	}
	public static void main (String [] args) {
		UpperLowerCaseConverter ulcc = new UpperLowerCaseConverter();
		ulcc.setVisible(true);
	}
}