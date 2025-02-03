//Computer Programming II //M05
//Shreya Shukla
//02/22/2022
//Module 3 Inheritance 101 Lab
public class Driver {
        //creates ONE student and ONE teacher and prints out detailed info
        public static void main (String [] args){
        Teacher Stark = new Teacher ("1098094", 1000000, 30, "Tony Stark", 53, "234989234", false);
        Student Spidey = new Student ("1295849", 4.0, "100", "Peter Parker", 18, "435234443", true);
        System.out.println(Stark.toString());
        System.out.println();
        System.out.println(Spidey.toString());
    }
}