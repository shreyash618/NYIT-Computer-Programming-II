//CSCI 185 Spring 2022 M05
//Shreya Shukla
//02/01/2022
//Module 1 Class and Object Lab

public class Rectangle{
    //data fields
    double width = 1.0;
    double height = 1.0;
    //main method- initializes two rectangles and calculates perimeter and width
    public static void main (String [] args){
        Rectangle rect1 = new Rectangle();
        System.out.println ("The area of the first rectangle is: " + rect1.getArea());
        Rectangle rect2 = new Rectangle (4.0, 40.0);
        System.out.println ("Thr perimeter of the second rectangle is: " + rect2.getPerimeter());
    }
    //no-arg default constructor
    public Rectangle (){
    }
    //constructor
    public Rectangle (double w, double h) {
        this.width = w;
        this.height = h;
    }
    //returns the area of a rectangle
    public double getArea(){
        return this.width * this.height;
    }
    //returns the perimeter of a rectangle
    public double getPerimeter(){
        return 2*(this.width + this.height); 
    }

}