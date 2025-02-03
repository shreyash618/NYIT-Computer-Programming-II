/***************************************
 * CSCI 185 M05 Spring 2022
 * Shreya Shukla
 * M7: Develop More Advanced Java GUI Lab
 * 4/21/2022
****************************************/
import java.awt.*;
import javax.swing.*;
public class MUC extends JFrame{
    //constructor
	public MUC() {
		super("Measurement Unit Converter");
		setLocation (100,100);
		setSize (480, 420);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//create a label with text "pound: "
		JLabel jlblPound = new JLabel("pound: ");
		add (jlblPound, BorderLayout.WEST);
		//create a label with text "kg: "
		JLabel jlblKg = new JLabel("kg: ");
		add (jlblKg, BorderLayout.CENTER);
        //create a textfield to enter amount in pounds
		JTextField jtfPound = new JTextField();
		add (jtfPound, BorderLayout.EAST);
		//create a textfield to display amount in kilograms
		JTextField jtfKg = new JTextField("kg: ");
		add (jtfKg, BorderLayout.EAST);
		//create a button with text "convert"
		JButton jbtConvert = new JButton("convert");
		add (jbtConvert, BorderLayout.SOUTH);
		//create a button with text "clear"
		JButton jbtClear = new JButton("clear");
		add (jbtClear, BorderLayout.SOUTH);
	}
	public static void main (String [] args){
		MUC mUnitConverter = new MUC();
		mUnitConverter.setVisible(true);
	}
}