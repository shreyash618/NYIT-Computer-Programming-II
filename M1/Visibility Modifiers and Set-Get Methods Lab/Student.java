//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//02/02/2022
//Module 1 Modifiers and Set/Get Methods Lab
public class Student{
    //private data fields
    private String name;
    private String stu_id;
    private double GPA;
    private int age;
    //fully loaded constructor
    public Student(String n, String id, double gpa, int a){
        this.name = n;
        this.stu_id = id;
        this.GPA = gpa;
        this.age = a;
    }
    //no-arg constructor
    public Student (){
    }
    //set (mutator) methods
    public void setName (String n1){
        this.name = n1;
    }
    public void setId (String i1){
        this.stu_id = i1;
    }
    public void setGpa (double g1){
        this.GPA = g1;
    }
    public void setAge (int a1){
        this.age = a1;
    }
    //get (accessor) methods
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.stu_id;
    }
    public double getGpa(){
        return this.GPA;
    }
    public int getAge(){
        return this.age;
    }
    //toString method (not required but I wanted to include it)
    public String toString(){
        String output = "";
        output+= "Student Info:\n******************************************\n" + "Name: " + this.name;
        output+= "\nId: " + this.stu_id;
        output+= "\nGPA: " + this.GPA;
        output+= "\nAge: " + this.age + "\n";
        return output;
    }

}