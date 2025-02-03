/*CSCI 185 Spring 2022 MO5
/Shreya Shukla
/03/01/2022
/Module 3 Integration of Inheritance and Composition Lab*/
public class Department{
    //The basic feature of a department
    private String deptName;
    private int numMajors;
    private Teacher[] listTeachers; //inherits from Person class
    private Student[] listStudents; //inherits from Person class
    //Construct a department object (at least TWO constructors)
    //fully-loaded constructor 
    public Department (String n, int num, Teacher [] teachers, Student [] students){
        this.deptName = n;
        this.numMajors = num;
        this.listTeachers = new Teacher [teachers.length];
        this.listStudents = new Student [students.length];
        for (int i = 0; i<teachers.length; i++){
            this.listTeachers [i] = teachers [i];
        }
        for (int j = 0; j<students.length; j++){
            this.listStudents[j] = students [j];
        }
    }
    //copy constructor
    public Department (Department A){
        this.deptName = A.name;
        this.numMajors = A.numMajors;
        this.listTeachers = new Teacher [A.listTeachers.length];
        this.listStudents = new Student [A.listStudents.length];
        for (int i = 0; i<A.listTeachers.length; i++){
            this.listTeachers [i] = A.listTeachers [i];
        }
        for (int j = 0; j<A.listStudents.length; j++){
            this.listStudents[j] = A.listStudents[j];
        }
    }
    //Accessors and mutators (one pair per each feature)
    public void setDeptName (String n){
        this.deptName = n;
    }
    public String getDeptName (){
        return this.deptName;
    }
    public void setNum_Majors (int n){
        this.numMajors = n;
    }
    public int getNum_Majors (){
        return this.numMajors;
    }
    public void setList_Teachers (Teacher [] teachers){
        this.listTeachers = new Teacher [teachers.length];
        for (int i = 0; i < teachers.length; i++){
            this.listTeachers[i] = new Teacher (teachers[i]);
        }
    }
    public Teacher [] getList_Teachers (){
        Teacher [] temp = new Teacher[this.listTeachers.length];
        for (int i = 0; i < this.listTeachers.length; i++){
            temp[i] = new Teacher (this.listTeachers[i]);
        }
        return temp;
    }
    public void setList_Students (Student [] students){
        this.listStudents = new Student [students.length];
        for (int i = 0; i < students.length; i++){
            this.listStudents[i] = new Student (students[i]);
        }
    }
    public Student [] getList_Students (){
        Student [] temp = new Student[this.listStudents.length];
        for (int i = 0; i < this.listStudents.length; i++){
            temp[i] = new Student (this.listStudents[i]);
        }
        return temp;
    }

    //toString method
    public String toString(){
        String output = "Department Info:\n****************************************************\n";
        output += "Department Name: " + this.deptName;
        output += "\nNumber of Majors: " + this.numMajors;
        output += "\n\nList of Teachers in Department: ";
        for (int i = 0; i< this.listTeachers.length; i++){
            output += "\nTeacher #" + (i+1) + " " + this.listTeachers[i].toString() + "\n";
        }
        output += "\nList of Students in Department:\n";
        for (int i = 0; i< this.listStudents.length; i++){
            output += "\nStudent #" + (i+1) + " " + this.listStudents[i].toString() + "\n";
        }
        return output;
    }
    //main method
    public static void main (String [] args){
        //create 5 students and 3 teachers
        Teacher Snape = new Teacher ("234229876", 200000, 13, "Severus Snape", 38, "152987754", false);
        Teacher McGonagall = new Teacher ("169257490", 500000, 35, "Minerva McGonagall", 76, "234657893", true);
        Teacher Lockhart = new Teacher ("10542325", 100000, 1, "Gilderoy Lockhart", 35, "232545121", true);
        Teacher Lupin = new Teacher ("076305482", 150000, 12, "Remus John Lupin", 38, "73059632", false);
        Teacher [] t_list_1 = {Snape, Lockhart, Lupin};
        Teacher [] t_list_2 = {Snape, McGonagall, Lupin};
        Student Harry = new Student ("457829399", 3.8, "7th year", "Harry James Potter", 17, "92572334", true);
        Student Hermione = new Student ("232354232", 4.0, "7th year", "Hermione Jean Granger", 18, "97232423", true);
        Student Ron = new Student ("908234523", 3.9, "7th year", "Ronald Bilius Weasley", 18, "74293548", true);
        Student Ginny = new Student ("232455345", 4.0, "6th year", "Ginerva Molly Weasley", 17, "81023223", true);
        Student Neville = new Student ("434323342", 3.7, "7th year", "Neville Longbottom", 17, "23873456", true);
        Student [] s_list = {Harry, Hermione, Ron, Ginny, Neville};
        //create 2 departments using constructor
        Department Def_Dark_Arts = new Department ("Defense against the Dark Arts", 12, t_list_1, s_list);
        Department OWL_test_prep  = new Department ("Ordinary Wizarding Levels Test Preparation", 5, t_list_2, s_list);
        System.out.println(Def_Dark_Arts.toString());
        System.out.println(OWL_test_prep.toString());
    }
}