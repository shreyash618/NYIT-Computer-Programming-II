//CSCI 185 Spring 2022 MO5
//Shreya Shukla
//02/02/2022
//Module 1 Modifiers and Set/Get Methods Lab

public class StudentAccess{
    //main method
    public static void main (String args []){
        //instatiates three student objects by using the two constructors separately
        Student Sarah = new Student ();
        Student Jose = new Student ("Jose", "1295849", 3.8, 21);
        Student Efron = new Student ("Efron", "216994848", 4.0, 18);
        //shows how to use accessor methods to get data fields of the Student
        System.out.println("Demonstrates how to use the accessor methods on object Jose.");
        System.out.println(Jose.getName());
        System.out.println(Jose.getId());
        System.out.println(Jose.getGpa());
        System.out.println(Jose.getAge());
        System.out.println();
        //shows how to use mutator methods to set data fields of the Student;
        Sarah.setName("Sarah");
        Sarah.setId ("216994787");
        Sarah.setGpa (3.9);
        Sarah.setAge (18);
        //calls my optional toString methods on each of the objects to show that the mutator method and constructor worked
        System.out.println(Sarah.toString());
        System.out.println(Jose.toString());
        System.out.println(Efron.toString());

    }
}