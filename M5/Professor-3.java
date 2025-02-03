//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//03/17/2022
//M5 Abstract Class Lab
import java.util.GregorianCalendar;
public class Professor extends Employee{
    public double salary; //annual
    //constructor
    public Professor (String s, String n, GregorianCalendar d, double sal){
        super (s, n, d);
        this.salary = sal;
    }
    //copy-constructor
    public Professor (Professor A){
        super(A.getSSN(), A.getName(),A.getDate());
        this.salary = A.salary;
    }
    //set-get methods
    public void setSalary (double s){
        this.salary = w;
    }
    public double getSalary (){
        return this.salary;
    }
    //overridden getPay method
    public double getPay(){
        return salary / 12;
    }
    //overridden get days off method
    public double getDaysOff(){
        return 24.0;
    }
    //toString method
    public String toString (){
        String output = "Professor Info:\n************\n\n";
        output += super.toString();
        output += "\nSalary: " + this.salary;
		output += "\nMonthly Pay: " + this.getPay();
        output += "\nDays Off: " + this.getDaysOff();
		return output;
    }

}