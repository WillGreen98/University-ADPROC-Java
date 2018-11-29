package shapes;

public class Square extends Rectangle {
    public Square() {};
    public Square(double side) {
        super(side, side);
    }

    public double area() {
        return  super.area();
    }
    public double perimeter() { return super.perimeter(); }
    public String displayName()  {
        return "Square (" + a + ")\t\t";
    }

    public void setSide(double side) {
        super.setWidth(side);
    } 
}

