package Abstraction;

abstract class shape {
    String name;

    public shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();

    abstract double calculateVolume();

    void displayName() {
        System.out.println("Name :" + name);
    }
}

class circle extends shape {
    double radius;

    circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }

}


public class absytraction {
    public static void main(String[] args) {
        
    }
}