//Computer Programming II //M05
//Shreya Shukla
//04/05/2022
//Module 6 Lab: Introduction to Exception Handling Lab

//I referenced Stanley Yu's lab to understand how to implement a error-checking while loop

import javax.swing.JOptionPane;
public class FirstRPSGame {
    public static void main(String args[]) { 
    //Variable declaration
    int yourChoice, computerChoice; //comments here
    String yourInput; // comments here
    String [] elements = {"rock", "paper", "scissor"};
    boolean input = true;
    //Welcome screen and show the basic rule to the user
    JOptionPane.showMessageDialog(null, "Welcome to Paper, Scissor and Rock");
    JOptionPane.showMessageDialog(null,"Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
    JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor");
    //scissor beats paper    2 > 1 diff: 1
    //paper beats rock       1 > 0 diff: 1
    //rock beats scissors    0 > 2 diff: -2 
    //alternate method to checking who won is to see if difference between winner and loser is 1 or -2
    do {
      //Get your choice
      yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
      yourChoice = Integer.parseInt(yourInput);
      if ((yourChoice == 0) || (yourChoice == 1) || (yourChoice == 2)){
        input = false; //exit the while loop if you enter a valid input 
      }
      //prints invalid parameter and repeats while loops if input is true
      else{
        JOptionPane.showMessageDialog(null, "You entered a invalid input. Try again.");
      }       
    } while (input); //continues the while loop while your input is true.
    //Prints what you chose to the dialog box
    JOptionPane.showMessageDialog(null, "You chose: " + yourChoice + " (" + elements[yourChoice]+ ")");

    //Get computer choice
    computerChoice = (int)(Math.random()*10); //generate a random number
    computerChoice %= 3; //We use modulus 3 because it will generate a 
    // remainder of 0, 1, or 2 (corresponding to rock, papers, scissors)
    

    //Compare your Choice with computer’s choice and output the result
    
    //Case I: Both you and computer pick the same choice, then it’s a tie!
    if (yourChoice == computerChoice){
      JOptionPane.showMessageDialog(null, "Computer Chose: " + computerChoice + " (" + elements[computerChoice] + ")");
      JOptionPane.showMessageDialog(null,"It’s a tie!"); 
    }

    //Case II: You WIN 🙂
    else if (yourChoice == 2 && computerChoice == 1|| yourChoice == 1 && computerChoice == 0
      || yourChoice == 2 && computerChoice == 0){
          JOptionPane.showMessageDialog(null, "Computer Chose: " + computerChoice + " (" + elements[computerChoice] + ")");
          JOptionPane.showMessageDialog (null,"You Win!");
      }        
    //Case III: You lose 😦
    else if (yourChoice == 1 && computerChoice == 2|| yourChoice == 0 && computerChoice == 1
    || yourChoice == 0 && computerChoice == 2){
      JOptionPane.showMessageDialog(null, "Computer Chose: " + computerChoice + " (" + elements[computerChoice] + ")");
      JOptionPane.showMessageDialog (null, "You Lose!");
    }   
  }
}