package shapes;

public abstract class TwoDShape {
    double a, b, c;
   
    TwoDShape() { }
    TwoDShape(double side) {
        a = side;
    }
    TwoDShape(double side1, double side2) {
        a = side1;
        b = side2;
    }

    TwoDShape(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;
    }    

    void setSide1(double side1) {
        a = side1;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract String displayName();
}