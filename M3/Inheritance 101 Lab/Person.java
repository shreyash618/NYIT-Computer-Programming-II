//Computer Programming II //M05
//Shreya Shukla
//02/22/2022
//Module 3 Inheritance 101 Lab
public class Person{
    //data-fields
    private String name;
    private int age;
    private String ssn;
    private boolean alive;
    //fully loaded constructor
    public Person (String n, int y, String social, boolean a){
        this.name = n;
        this.age = y;
        this.ssn = social;
        this.alive = a;
    }
    //copy-constructor
    public Person (Person A){
        this.name = A.name;
        this.age = A.age;
        this.ssn = A.ssn;
        this.alive = A.alive;
    }
    //set-get methods
    public void setName (String n1){
        this.name = n1;
    }
    public void setAge (int y1){
        this.age = y1;
    }
    public void setSocial (String social1){
        this.ssn = social1;
    }
    public void setStatus (boolean a1){
        this.alive = a1;
    }
    public String getName (){
        return this.name;
    }
    public int getAge (){
        return this.age;
    }
    public String getSocial (){
        return this.ssn;
    }
    public Boolean getStatus (){
        return this.alive;
    }
    //toString method
    public String toString(){
        String output = "";
        output += "Name: " + this.name;
        output += "\nAge: " + this.age;
        output += "\nSSN: " + this.ssn;
        output += "\nState: ";
        if (this.alive == true) {
            output += "Alive";
        }
        else if (this.alive == false){
            output += "Deceased";
        }
        return output;
    }
}