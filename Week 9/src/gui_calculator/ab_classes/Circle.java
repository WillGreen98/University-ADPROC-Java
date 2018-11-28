package gui_calculator.ab_classes;

public class Circle extends TwoDShape {
    public Circle() {};
    Circle(double radius) {
        super(radius);
    }

    public double area() {
        return a*a*Math.PI;
    }
    public double perimeter() {
        return 2*a*Math.PI;
    }
    public String displayName()  {
	return "Circle (" + a + ")\t"; 
    }
    
    public void setRadius(double radius) {
        super.setSide1(radius);
    } 
}