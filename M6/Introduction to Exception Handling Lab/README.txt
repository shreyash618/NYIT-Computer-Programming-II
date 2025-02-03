Instructions
In this lab, we will start practicing on using exception handling to make our Java program more resilient to deal with errors and unexpected situations.

Follow the steps below to complete your lab assignment.

esComponent-callout
Callout (Standard)

Options

## For Callout Standard consistency, do not change the Logo and AccentColor options ##

setLogo-false, setAccentColor-primary setPosition-fullWidth

Title

Rock, Paper, Scissors Game
Content

 

In this lab, we will start working on the game “Rock, Paper, and Scissors”, and we can gradually improve our program step by step in the future. Please use the do-while loop to perform exception and error checking.

Note that the program is partially finished and you should add statements and/or comments to make it work properly and easy to understand.

 

/* Program name: Paper, Scissor and Rock Version 0.1
Initially created by Dr. Wenjia Li
Finished by _(Your Name)__ 
_   __(Today’s Date)______ 
*/

import javax.swing.JOptionPane;

public class FirstRPSGame 
{ 
   public static void main(String args[]) 
   { 
      //Variable declaration
      int yourChoice, computerChoice; //comment please!
      String yourInput; //comment please!

      //Welcome screen and show the basic rule to the user
      JOptionPane.showMessageDialog(null,”Welcome to Paper, Scissor and Rock”);
      JOptionPane.showMessageDialog(null,”Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ”);
      JOptionPane.showMessageDialog(null,”0: Rock\n1: Paper\n2: Scissor”);

      //Get your choice
      ______ = JOptionPane.showInputDialog(“Now tell me your choice!”);
      yourChoice = Integer.parseInt(_________);

      //Get computer choice
      computerChoice = (int)(Math.random()*10); //generate a random number
      computerChoice %= 3; //Why we need to modulus 3 here? Think about it.

      //Compare your Choice with computer’s choice and output the result
      //Case I: Both you and computer pick the same choice, then it’s a tie!
      if (yourChoice == computerChoice){
          JOptionPane.showMessageDialog(null,“It’s a tie!”); 
      }

      //Case II: You WIN :)




      //Case III: You lose :(


   }
}
esComponent-sectionDivider
Section Divider

Options

setPosition-fullWidth

Requirements
Submit your lab assignment by the posted due date.
Your lab assignment should be submitted as a Java or a zip file.
You should submit your own work for this lab, but you are welcome to ask classmates, the teaching assistant, or your instructor for assistance or feedback as you work on the lab. 
You may also find online tutorials or resources to assist you while working on the lab.
You are allowed to submit your lab up to 5 times, so you may resubmit if you would like to make changes to your lab. You will be graded based on your most recent submission.
