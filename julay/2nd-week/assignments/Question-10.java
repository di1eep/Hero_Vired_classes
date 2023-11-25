import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your StringName :");
        String stringName = sc.next();
        System.out.println("Enter your Starting index:");
        int Starting = sc.nextInt();
        System.out.println("Enter your Ending Index:");
        int Ending = sc.nextInt();

        String subString = stringName.substring(Starting, Ending+1);
        System.out.println("subString of "+ stringName+" from "+Starting+" to "+Ending+" is:" + subString);

    }
}

