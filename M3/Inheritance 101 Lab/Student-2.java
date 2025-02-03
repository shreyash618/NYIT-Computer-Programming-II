//Computer Programming II //M05
//Shreya Shukla
//02/22/2022
//Module 3 Inheritance 101 Lab
public class Student extends Person{
    //data-fields
    private String stu_id;
    private double gpa;
    private String grade;
    //fully-loaded constructor
    public Student (String s, double d, String g, String n, int y, String social, boolean a){
        super(n, y, social, a);
        this.stu_id = s;
        this.gpa = d;
        this.grade = g;
    }
    //copy-constructor
    public Student (Student A){
        super(A.getName(), A.getAge(), A.getSocial(), A.getStatus());
        this.stu_id = A.stu_id;
        this.gpa = A.gpa;
        this.grade = A.grade;
    }
    //set-get methods
    public void setStudentId (String sid){
        this.stu_id = sid;
    }
    public void setGPA (double avg){
        this.gpa = avg;
    }
    public void setGrade (String marks){
        this.grade = marks;
    }
    public String getStudentId (){
        return this.stu_id;
    }
    public double getGPA (){
        return this.gpa;
    }
    public String getGrade (){
        return this.grade;
    }
    //toString method
    public String toString(){
        String output = "Student Info:\n\n";
        output += super.toString();
        output += "\nStudent Id: " + this.stu_id;
        output += "\nGPA: " + this.gpa;
        output += "\nGrade: " + this.grade;
        return output;
    }
}