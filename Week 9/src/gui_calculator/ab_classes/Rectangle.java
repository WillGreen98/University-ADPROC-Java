package gui_calculator.ab_classes;

public class Rectangle extends TwoDShape {
    Rectangle() {};
    Rectangle(double width, double length) {
        super(width, length);
    }

    public double area() {
        return a*b;
    }
    public double perimeter() {
        return 2*(a+b);
    }
    public String displayName()  {
	return "Rectangle (" + a + ", " + b + ")\t"; 
    }

    void setWidth(double width) {
        super.setSide1(width);
    } 
}