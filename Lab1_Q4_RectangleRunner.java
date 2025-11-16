// Lab1_Q4_Rectangle.java
class Rectangle {
    public double length;
    public double width;

    public void area() {
        double a = length * width;
        System.out.println("Area of Rectangle = " + a);
    }
}

public class Lab1_Q4_RectangleRunner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 5;
        r.width = 3;
        r.area();
    }
}
