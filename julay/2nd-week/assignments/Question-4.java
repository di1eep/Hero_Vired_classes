import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String Continue = "";

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number :");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("The given number - " + num + "is a even Number");
            } else {
                System.out.println("The given number - " + num + "is a odd Number");
            }

            System.out.println("If you want to continue press 'y'");
            Continue = sc.next();

        }while(Continue.equals("y"));
        
    }
}


