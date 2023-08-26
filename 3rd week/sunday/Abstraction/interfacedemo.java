package Abstraction;

interface shape{
    double calculateArea();
    double calculateVolume();
    String getName();
    void display();
}
class circle implements shape {
    double radius;
    private String name = "Circle";

    circle(double radius) {
        
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateVolume() {
        return Math.PI * (radius * radius * radius);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : " + name);
    }

}

class trangle implements shape {
    double height;
    double width;
    double base;
    private String name = "trangle";

    trangle(double height, double width, double base) {
        
        this.height = height;
        this.width = width;
        this.base = base;
    }

    public double calculateArea() {
        return 1.5 * height * width;
    }

    public double calculateVolume() {
        return 0.5 * (base * height * width);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Name : " + name);
    }

}