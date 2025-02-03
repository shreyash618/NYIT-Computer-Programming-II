//Computer Programming II //M05
//Shreya Shukla
//03/10/2022
//Module 4 Polymorphism Lab
public class Professor extends Person{
    //data-fields
    private String fac_id;
    private String research_area;
    private int salary;
    private int num_vacation;
    //fully loaded constructor
    public Professor (String name, int age, String social, boolean alive, String f_id, String research, int sal, int num_vac){
        super(name, age, social, alive);
        this.fac_id = f_id;
        this.research_area = research;
        this.salary = sal;
        this.num_vacation = num_vac;
    }
    //gets paid monthly, so multiply by 12 to get annual salary
    public void getPaid(){
        System.out.println(this.getName() + " gets paid $" + (this.salary * 12) + " annually.");
    }
    //gets 3 months vacations, so multiply by 90 to get number of vacation days
    public void getVacation(){
        System.out.println(this.getName() + " gets " + (this.num_vacation * 90) + " vacation days.");
    }

    //copy-constructor
    public Professor (Professor A){
        super(A.getName(), A.getAge(), A.getSocial(), A.getStatus());
        this.fac_id = A.fac_id;
        this.research_area = A.research_area;
        this.salary = A.salary;
        this.num_vacation = A.num_vacation;
    }
    //set-get methods
    public void setFac_Id(String id){
        this.fac_id = id;
    }
    public void setResearch_Area (String r){
        this.research_area = r;
    }
    public void setSalary (int s){
        this.salary = s;
    }
    public void setNum_Vacation (int n){
        this.num_vacation = n;
    }
    public String getFac_Id (){
        return this.fac_id;
    }
    public String getResearch_Area (){
        return this.research_area;
    }
    public String getSalary (){
        return this.salary;
    }
    public Boolean getNum_Vacation (){
        return this.num_vacation;
    }
    //toString method
    public String toString(){
        String output = super.toString();
        output += "\nFaculty Id: " + this.fac_id;
        output += "\nResearch Area: " + this.research_area;
        output += "\nSalary: " + this.salary;
        output += "\nNumber of Vacations allowed: " + this.num_vacation;
        return output;
    }
}