package triangle;

public class RightTriangle extends Triangle {
    public RightTriangle() {}

    RightTriangle(double side1, double side2) {
        super(side1, side2);
    }

    protected double area() {
        return (a * b) / 2.0;
    }

    public String displayName() {
        return "Right Triangle (" +a+", "+b+")";
    }
}