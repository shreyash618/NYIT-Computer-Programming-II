//Computer Programming II //M05
//Shreya Shukla
//03/10/2022
//Module 4 Polymorphism Lab
public class Secretary extends Person{
    //data-fields
    private String fac_id;
    private int num_service;
    private int salary;
    private int num_vacation;
    //fully loaded constructor
    public Secretary (String name, int age, String social, boolean alive, String f_id, int num_ser, int sal, int num_vac){
        super(name, age, social, alive);
        this.fac_id = f_id;
        this.num_service = num_ser;
        this.salary = sal;
        this.num_vacation = num_vac;
    }
    //gets paid bi-weekly, so multiply by 26 to get annual salary (cuz there are 52 weeks in a year)
    public void getPaid(){
        System.out.println(this.getName() + " gets paid $" + (this.salary * 26) + " annually.");
    }
    //gets 1 months vacation, so multiply by 30 to get number of vacation days
    public void getVacation(){
        System.out.println(this.getName() + " gets " + (this.num_vacation * 30) + " vacation days.");
    }

    //copy-constructor
    public Secretary (Secretary A){
        super(A.getName(), A.getAge(), A.getSocial(), A.getStatus());
        this.fac_id = A.fac_id;
        this.num_service = A.num_service;
        this.salary = A.salary;
        this.num_vacation = A.num_vacation;
    }
    //set-get methods
    public void setFac_Id(String id){
        this.fac_id = id;
    }
    public void setNum_Service (int num){
        this.num_service = num;
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
    public int getNum_Service (){
        return this.num_service;
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
        output += "\nNumber of Services: " + this.num_service;
        output += "\nSalary: " + this.salary;
        output += "\nNumber of Vacations Allowed: " + this.num_vacation;
        return output;
    }
}