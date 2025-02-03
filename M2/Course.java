/*CSCI 185 Spring 2022 MO5
/Shreya Shukla
/02/15/2022
/Module 2 Composition Lab*/
public class Course{
    //The basic feature of a course
    public String courseName;
    private String courseNumber;
    public String instructorName;
    private Student[] listStudents;
    //Construct a course object (TWO constructors)
    //fully loaded constructor
    public Course (String name, String num, String instructor, Student [] s_list){
        this.courseName = name;
        this.courseNumber = num;
        this.instructorName = instructor;
        //creates a new list of the same length as the inputted list
        this.listStudents = new Student [s_list.length];
        for (int i = 0; i < s_list.length; i++){
            //creates a duplicate student and stores it in the Course's list
            this.listStudents[i] = new Student (s_list[i]);
        }
    }
    //copy constructor
    public Course (Course A){
        if (A == null){
            System.out.println("Object is NOT valid. Stop here!");
            System.exit(0);
        }
        this.courseName = A.courseName;
        this.courseNumber = A.courseNumber;
        this.instructorName = A.instructorName;
        this.listStudents = new Student [A.listStudents.length];
        for (int i = 0; i < A.listStudents.length; i++){
            //creates a duplicate student and stores it in the Course's list
            this.listStudents [i] = new Student(A.listStudents[i]);
        }
    }

    //Accessors and mutators (one pair per each feature)
    public void setName(String name) {
        this.courseName = name;
    }
    public void setNumber(String num) {
        this.courseNumber = num;
    }
    public void setInstructor (String instructor){
        this.instructorName = instructor;
    }
    public void setStudents (Student [] list1){
        //creates a new list of the same length as the inputted list
        this.listStudents = new Student[list1.length];
        //creates a duplicate student and stores it in the Course's list
        for (int j = 0; j < list1.length; j++){
            this.listStudents[j] = new Student (list1[j]);
        }
    }
    public String getName (){
        return this.courseName;
    }
    public String getNumber (){
        return this.courseNumber;
    }
    public String getInstructor (){
        return this.instructorName;
    }
    public Student [] getStudents (){
        //creates a new list to store the students information
        Student [] temp = new Student [this.listStudents.length];
        for (int k = 0; k < temp.length; k++){
            //copies student info from the Course's list into the temp list
            temp[k] = new Student (this.listStudents[k]);
        }
        //returns the duplicate list so original data can't be accessed and altered
        return temp;
    }
    //toString method
    public String toString() {
        String output = "";
        output += "Course Info:\n****************************************\n\n" + "Course Name: " + this.courseName;
        output += "\n\nCourse Number: " + this.courseNumber;
        output += "\n\nInstructor Name: " + this.instructorName;
        output += "\n\nClass Roster:\n\n";
        for (int i = 0 ; i<this.listStudents.length; i++){
            output += "Student #" + (i+1) + " Info:" + this.listStudents[i].toString() + "\n\n";
        }
        return output;
    }
    public static void main (String [] args){
        /*initializes 5 new Student objects using the Student Class*/
        Student Hermione = new Student ("Hermione Granger", "1435323", 4.0, 17);
        Student Nam_Ra = new Student ("Choi Nam Ra", "1245567", 4.0, 19);
        Student SeoJun = new Student ("Han SeoJun", "1589545", 3.9, 18);
        Student Andrea = new Student ("Andrea Sachs", "1445756", 3.8, 19);
        Student Shreya = new Student ("Shreya Shukla", "1295849", 4.0, 18);
        /*creates two student lists to be assigned to the courses*/
        Student [] class_roster1 = {Hermione, Nam_Ra, SeoJun};
        Student [] class_roster2 = {Nam_Ra, Andrea, Shreya};

        /*create two courses, Programming 2 and Calculus 2 using the fully loaded constructor*/
        Course CS = new Course ("Computer Programming 2", "CSCI 185", "Wenjia Li", class_roster1);
        Course Calc = new Course ("Calculus 2", "MATH 180", "Laihan Luo", class_roster2);
        
        System.out.println(CS.toString());
        System.out.println(Calc.toString());
    }
}
