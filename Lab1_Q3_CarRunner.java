class Car {
    public String make;
    public String model;
    public int year;
    public double speed;

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }

    public void display() {
        System.out.println(year + " " + make + " " + model + " Speed: " + speed);
    }
}

public class Lab1_Q3_CarRunner {
    public static void main(String[] args) {
        Car c = new Car();
        c.make = "Toyota";
        c.model = "Corolla";
        c.year = 2020;
        c.speed = 50;
        c.accelerate();
        c.display();
        c.brake();
        c.display();
    }
}
