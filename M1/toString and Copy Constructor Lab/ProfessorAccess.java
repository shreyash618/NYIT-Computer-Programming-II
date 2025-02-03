////CSCI 185 Spring 2022 M05
//Shreya Shukla
//02/10/2022
//Module 1 toString and Copy Constructor Lab
public class ProfessorAccess {
    public static void main (String [] arg){
        //instatiates three new professor objects
        //these two objects are instantiated using the fully loaded constructor
        Professor Strange = new Professor ("Dr.Strange", "Neurosurgery/Medicine", 1000000, 20);
        Professor X = new Professor("Charles Xavier", "Telepathy", 150000, 20);
        //this object is instantiated using copy constructtor
        //Professor Willie is a copy of Dr.Strange
        Professor Willie = new Professor (Strange);
        //shows how to use accessor methods by accessing Professor Willie's data fields
        System.out.println("This is a test of the accessor methods:");
        System.out.println(Willie.getName());
        System.out.println(Willie.getDept());
        System.out.println(Willie.getSalary());
        System.out.println(Willie.getYears());
        //shows how to use mutator methods by changing Professor Willie's data fields
        Willie.setName("Willie");
        Willie.setDept("Math");
        Willie.setSalary (150000);
        Willie.setYears (10);
        //shows how to use mutator methods by changing Dr.Strange's profession from Neurosurgeon to Sorcerer Supreme
        Strange.setDept("Sorcery and Telepathy");
        Strange.setSalary(300000);
        Strange.setYears(5);
        //shows how to use the toString method by calling it on each Professor
        System.out.println(Willie.toString());
        System.out.println(Strange.toString());
        System.out.println(X.toString());
    }
}