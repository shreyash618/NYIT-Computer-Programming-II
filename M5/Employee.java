//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//03/17/2022
//M5 Abstract Class Lab

import java.util.*;
public abstract class Employee{
	//data fields
	private String SSN;
	private String name;
	private GregorianCalendar hireDate;
	//constructor
	public Employee (String s, String n, GregorianCalendar d){
		this.SSN = s;
		this.name = n;
		this.hireDate = d; //Gregorian Calendar is mostly ints and doesn't have deep data hierarchy, so no need for copy constructor
	}
	//abstract methods
	public abstract double getPay();
	public abstract double getDaysOff();
	
	//concrete methods
	public Boolean samePay (Employee other){
		if (this.getPay() == other.getPay()){
			return true;
		}
		else return false; 
	}
	public Boolean sameDaysOff (Employee other){
		if (this.getDaysOff() == other.getDaysOff()){
			return true;
		}
		return false;
	}
	//copy constructor
	public Employee (Employee A){
		this.SSN = A.SSN;
		this.name = A.name;
		this.hireDate = A.hireDate;
	}
	//set-get methods
	public void setSSN(String s){
		this.SSN = s;
	}
    public String getSSN(){
        return this.SSN;
    }
	public void setName(String n){
		this.name = n;
	}
    public String getName(){
        return this.name;
    }
	public void setDate (GregorianCalendar d){
		this.hireDate = d;
	}
    public GregorianCalendar getDate (){
        return this.hireDate;
    }
    //toString method
    public String toString (){
        String output = "";
        output += "\nSSN: " + this.SSN;
        output += "\nName: " + this.name;
		output += "\nDate Hired: " + (this.hireDate.MONTH + 1) + "/" + this.hireDate.DATE + "/" + this.hireDate.YEAR;
		return output;
    }
}