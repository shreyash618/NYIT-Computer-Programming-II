//Computer Programming II //M05
//Shreya Shukla
//03/10/2022
//Module 4 Polymorphism Lab
public class Student_worker extends Person{
    //data-fields
    private String ta_id;
    private String year;
    private int salary;
    private int num_vacation;
    private String course_taught;
    //constructor 
    public Student_worker (String name, int age, String social, boolean alive, String t_id, String yr, int sal, int num_vac, String course){
        super(name, age, social, alive);
        this.ta_id = t_id;
        this.year = yr;
        this.salary = sal;
        this.num_vacation = num_vac;
        this.course_taught = course;
    }
    //gets paid hourly(assume TA works 2000 hours a year)
    public void getPaid(){
        System.out.println(this.getName() + " gets paid $" + (this.salary * 2000) + " annually.");
    }
    //gets weekend vacation, so multiply by 2 to get number of vacation days
    public void getVacation(){
        System.out.println(this.getName() + " gets " + (this.num_vacation * 2) + " vacation days.");
    }
    //copy-constructor
    public Student_worker (Student_worker A){
        super(A.getName(), A.getAge(), A.getSocial(), A.getStatus());
        this.ta_id = A.ta_id;
        this.year = A.year;
        this.salary = A.salary;
        this.num_vacation = A.num_vacation;
        this.course_taught = A.course_taught;
    }
    //set-get methods
    public void setTa_Id(String id){
        this.ta_id = id;
    }
    public void setNum_Service (int num){
        this.num_service = num;
    }
    public void setSalary (int s){
        this.salary = s;
    }
    public void setYear(String yr){
        this.year = yr;
    }
    public void setCourse_Taught(String course){
        this.course_taught = course;
    }
    public String getTa_Id (){
        return this.ta_id;
    }
    public int getNum_Service (){
        return this.num_service;
    }
    public String getSalary (){
        return this.salary;
    }
    public String getYear(){
        return this.year;
    }
    public String getCourse_Taught(){
        return this.course_taught;
    }
    //toString method
    public String toString(){
        String output = super.toString();
        output += "\nTeaching Assistant Id: " + this.fac_id;
        output += "\nGraduation Year: " + this.num_service;
        output += "\nSalary: " + this.salary;
        output += "\nNumber of Vacations Allowed: " + this.num_vacation;
        output += "\nCourse Taught: " + this.course_taught;
        return output;
    }
}