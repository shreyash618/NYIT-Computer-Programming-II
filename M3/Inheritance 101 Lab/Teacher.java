//Computer Programming II //M05
//Shreya Shukla
//02/22/2022
//Module 3 Inheritance 101 Lab
public class Teacher extends Person{
    //data-fields
    private String id;
    private int salary;
    private int num_yr_prof;
    //fully-loaded constructor
    public Teacher (String ident, int s, int nyp, String n, int y, String social, boolean a){
        super(n, y, social, a);
        this.id = ident;
        this.salary = s;
        this.num_yr_prof = nyp;
    }
    //copy-constructor
    public Teacher (Teacher A){
        super(A.getName(), A.getAge(), A.getSocial(), A.getStatus());
        this.id = A.id;
        this.salary = A.salary;
        this.num_yr_prof = A.num_yr_prof;
    }
    //set-get methods
    public void setTeacherId (String ident){
        this.id = ident;
    }
    public void setSalary (int income){
        this.salary = income;
    }
    public void setYears (int yrs){
        this.num_yr_prof = yrs;
    }
    public String getTeacherId (){
        return this.id;
    }
    public int getSalary (){
        return this.salary;
    }
    public int getYears (){
        return this.num_yr_prof;
    }  
    //toString method
    public String toString(){
        String output = "Teacher Info:\n\n";
        output += super.toString();
        output += "\nTeacher Id: " + this.id;
        output += "\nSalary: " + this.salary;
        output += "\nNumber of Years in Profession: " + this.num_yr_prof;
        return output;
    }
}