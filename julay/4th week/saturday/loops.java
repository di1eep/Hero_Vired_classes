public class loops {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60};
    int search = 500;
    boolean flag = false;

    // for each loop  // 
  
    for (int i : arr) {
      if(i == search){
        System.out.println("Yes, value present ");
        flag = true;
        break;
      }
   
    }
    if (flag == false)  // flag
      System.out.println("No");
    
  }
}


//Write a Java program to check if an array contains a specific element.