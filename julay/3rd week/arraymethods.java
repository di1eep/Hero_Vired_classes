import java.util.Arrays;

public class arraymethods {
  public static void main(String[] args){}
        // To print the array Elements -
        System.out.println(Arrays.toString(numArray));

        
        // to compare two array elements -
         int[] numArrayTwo = {2,3,5,1,4};
        boolean areArrayEquals =  Arrays.equals(numArray,numArrayTwo);
        System.out.println("If both the arrays are Eqaul: " + areArrayEquals);

        // To sort the array elemnts in ascending order - 
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
 
        int[] newArray = new int[20];
        // int[] newArray = {0,0,0};
        Arrays.fill(newArray,6);
        System.out.println(Arrays.toString(newArray));        

        // copyOf(numArray) - numArray - 1,2,3,4,5 
        int[] newNum = Arrays.copyOf(numArray,5);
        System.out.println(Arrays.toString(newNum));
}

