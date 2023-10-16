//logical operators = used to connect two or more expressions
//  && = (AND) both conditions must be true
//  || = (or) either condition must be true
//  ! = (not) reverse boolean value of condition

public class switch{
  public static void main(String[] args){
    int temp = 35;
    if(temp > 30) {
        System.out.println("It's hot outside");
    }
    else if(temp >= 20 && temp <= 30){
        System.out.println("It is warm outside");
    }
    else {
        System.out.println("it is cold outside");
    }
  }
}