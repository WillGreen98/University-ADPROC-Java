package triangle;

public class Triangle {
    double a, b, c;

    Triangle() {}
    Triangle(double side) {
        a = b = c = side;
    }

    Triangle(double side1, double side2) {
        a = side1;
        b = side2;
        c = Math.sqrt(a*a + b*b);
    }

    Triangle(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;
    }

    double perimeter() {
        return a + b + c;
    }

    protected double area() {
        double area = this.perimeter() / 2.0;
        return Math.sqrt(area * (area-a) * (area-b) * (area-c));
    }

    public String displayName() {
        return "Triangle (" + a + ", " + b + ", " + c + ")";
    }
}
