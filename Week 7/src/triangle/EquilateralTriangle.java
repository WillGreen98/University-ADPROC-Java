package triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle() {}

    EquilateralTriangle(double side) {
        super(side);
    }

    protected double area() {
        return a * a * Math.sqrt(3.0) / 4.0;
    }

    public String displayName()  {
        return "Equilateral Triangle (" + a + ")";
    }
}