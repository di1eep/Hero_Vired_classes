import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Continue = "";

        do {
            System.out.println("select unit conversion from the menu \n " +
                    "1) CM to M\n" +
                    "2) M to KM\n" +
                    "3) KM to M\n" +
                    "4) M to CM");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your menu - ");
            int num = sc.nextInt();

            if(num == 1){
                System.out.println("Please enter the CM Value:");
                double num1 = sc.nextInt();
                System.out.println((int)num1 +" CM = "+ (double)(num1 / 100) + " M");
            }
            else if(num == 2){
                System.out.println("Please enter the M Value:");
                double num2 = sc.nextInt();
                System.out.println((int)num2 +" M = "+ (double)(num2 / 1000) + " KM");
            }
            else if(num == 3){
                System.out.println("Please enter the KM Value:");
                double num3 = sc.nextInt();
                System.out.println((int)num3 +" KM = "+ (double)(num3 * 1000) + " M");
            }
            else if(num == 4){
                System.out.println("Please enter the M Value:");
                double num2 = sc.nextInt();
                System.out.println((int)num2 +" M = "+ (double)(num2 * 100) + " CM");
            }

            System.out.println("If you want to continue press 'y'");
            Continue = sc.next();

        }while(Continue.equals("y"));

    }
}


