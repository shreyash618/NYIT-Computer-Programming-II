public class PersonDemo{
    public static void getPay_Type(Person p){
        p.getPaid();
    }
    public static void getVacation_Type (Person p){
        p.getVacation();
    }
    public static void main (String [] args){
        Professor Silverio = new Professor ("Rosa Silverio", 50, "124355468", true, "216994848", "Spanish Language", 150000, 1);
        Secretary Kim = new Secretary ("Kim Mi Soo", 30, "123546766", true, "123122321", 30, 300000, 3);
        Student_worker Shreya = new Student_worker("Shreya Shukla", 18, "123213432", true, "129584949", "2025", 18, 4, "Computer Science 185");
        getPay_Type(Silverio);
        getVacation_Type(Silverio);
        getPay_Type(Kim);
        getVacation_Type(Kim);
        getPay_Type(Shreya);
        getVacation_Type(Shreya);
        };
}
