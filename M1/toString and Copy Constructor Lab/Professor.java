////CSCI 185 Spring 2022 M05
//Shreya Shukla
//02/10/2022
//Module 1 toString and Copy Constructor Lab
public class Professor {
    //data-fields
    private String name;
    private String department;
    private double annual_salary;
    private int year_in_profession;
    //fully-loaded constructor
    public Professor(String n, String d, double a, int y){
        this.name = n;
        this.department = d;
        this.annual_salary = a;
        this.year_in_profession = y;
    }
    //copy-constructor
    public Professor (Professor X){
        //Check to see if X is valid
        if (X==null){
            System.out.println("Object is NOT valid. Stop here!");
            System.exit(0);
        }
        this.name = X.name;
        this.department = X.department;
        this.annual_salary = X.annual_salary;
        this.year_in_profession = X.year_in_profession;
    }
    //set methods
    public void setName(String n1){
        this.name = n1;
    }
    public void setDept(String d1){
        this.department = d1;
    }
    public void setSalary(double s1){
        this.annual_salary = s1;
    }
    public void setYears(int y1){
        this.year_in_profession = y1;
    }
    //get methods
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.department;
    }
    public Double getSalary(){
        return this.annual_salary;
    }
    public int getYears(){
        return this.year_in_profession;
    }
    //toString method
    public String toString(){
        String output = "";

        output+= "Professor Info:\n\n" + "Name: " + this.name;
        output+= "\nDepartment: " + this.department;
        output+= "\nAnnual Salary: " + this.annual_salary;
        output+= "\nYears in Profession: " + this.year_in_profession;

        return output;

    }
    
}