//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//03/17/2022
//M5 Abstract Class Lab
import java.util.GregorianCalendar; 
public class EmployeeDriver {
    //I created an extra method to return "Yes." for true and "No." for false boolean expressions
    public static String yesNo (Boolean A){
        if (A == false){
            return "No.";
        }
        else return "Yes.";
    }
    public static void main (String [] args){
        GregorianCalendar date = new GregorianCalendar(2021 + 1900, 11, 29);
        //Create two TA and Professer Objects
        TA SpongeBob = new TA ("123456789", "SpongeBob Squarepants", date, 15.0, 40.0);
        Professor SquidWard = new Professor("987654321","Squilliam Fancyson", date, 200000.0);
        System.out.println("Does TA SpongeBob recieve the same pay as Professor SquidWard? " + yesNo(SpongeBob.samePay(SquidWard)));
        System.out.println("Does TA SpongeBob recieve the same amount of days off as Professor SquidWard? " + yesNo(SpongeBob.sameDaysOff(SquidWard)));
        System.out.println("\n"); //prints two lines
        System.out.println (SpongeBob.toString());
        System.out.println (SquidWard.toString());
    }
}
