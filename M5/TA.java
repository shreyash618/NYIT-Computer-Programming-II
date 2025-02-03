//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//03/17/2022
//M5 Abstract Class Lab
import java.util.GregorianCalendar;
public class TA extends Employee {
    //data fields
    private double wageRate;
    private double hours; //for the month
    //constructor
    public TA (String s, String n, GregorianCalendar d, double w_r, double h){
        super(s,n,d);
        this.wageRate = w_r;
        this.hours = h;
    }
    //copy constructor
    public TA (TA A){
        super(A.getSSN(), A.getName(),A.getDate());
        this.wageRate = A.wageRate;
        this.hours = A.hours;
    }
    //set-get methods for each data field
    public void setWageRate (double w){
        this.wageRate = w;
    }
    public double getWageRate (){
        return this.wageRate;
    }
    public void setHours (double h){
        this.hours = h;
    }
    public double getHours (){
        return this.hours;
    }
    //overridden get pay method
    public double getPay (){
        return wageRate * hours;
    }
    //overridden get days off method
    public double getDaysOff(){
        return 4.0;
    }
    //toString method
    public String toString (){
        String output = "Teaching Assistant Info:\n************\n\n";
        output += super.toString();
        output += "\nWage Rate: " + this.wageRate;
        output += "\nHours Worked This Month: " + this.hours;
		output += "\nTotal Pay: " + this.getPay();
        output += "\nDays Off: " + this.getDaysOff();
		return output;
    }
}