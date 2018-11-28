package gui_calculator.ab_classes;

public class Triangle extends TwoDShape {
    public Triangle() {};
    Triangle(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    public double perimeter(){
        return a+b+c;
    }
    public double area() {
        double p = this.perimeter()/2.0;
        double work = p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(work);
    }

    public String displayName()  {
	return "Triangle (" + a + ", " + b + ", " + c +")";
    }  
}
