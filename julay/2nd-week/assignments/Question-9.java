import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        int divisors = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                divisors++;
            }
        }
        if(divisors == 2){
            System.out.println("The given number"+num+" is a Prime number.");
        }
        else{
            System.out.println("The given number "+num+" is NOT a Prime number");
        }

    }
}