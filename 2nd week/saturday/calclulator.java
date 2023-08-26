class operations {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}

class volume {
    public String shape = "cuboid";

    private int cuboid(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }
    public int rectangle(int num1, int num2) {
        return num1 * num2  ;
    }

}

public class calclulator {
    public static void main(String[] args) {
        // Creating an object of the SimpleCalculator class
        operations cal = new operations();
        volume vol = new volume();

        int resultAdd = cal.add(5, 3);
        System.out.println("Addition result: " + resultAdd);

        int resultSubtract = cal.subtract(10, 3);
        System.out.println("Subtraction result: " + resultSubtract);

        int resultmultiplication = cal.multiplication(10, 3);
        System.out.println("multiplication result: " + resultmultiplication);

        int resultdivision = cal.division(10, 3);
        System.out.println("division result: " + resultdivision);


        System.out.println("volumre of cuboid= " + vol.cuboid(12, 23, 23));

        System.out.println(vol.rectangle(12, 23));
    }
}