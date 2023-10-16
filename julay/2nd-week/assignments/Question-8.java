import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter your num2 ");
        int num2 = sc.nextInt();
        System.out.println("Enter your num3 ");
        int num3 = sc.nextInt();
        int temp = 0;
        temp=num1 < num2 ? num1 : num2;
        int smallest = num3 < temp ? num3 :temp;
        System.out.println("The Smallest Number: "+smallest);

        temp=num1 > num2 ? num1 : num2;
        int largest = num3 > temp ? num3 :temp;
        System.out.println("The Largest Number: "+largest);

        int Average = (num1 + num2 + num3) / 3;
        System.out.println("Average of all three numbers:"+Average);
    }
}

