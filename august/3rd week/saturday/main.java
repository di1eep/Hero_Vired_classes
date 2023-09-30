public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 10));           // Calls the first add method
        System.out.println(math.add(3.5, 2.7));        // Calls the second add method
        System.out.println(math.add(1, 2, 3));         // Calls the third add method
    }
}
