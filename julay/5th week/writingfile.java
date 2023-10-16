import java.io.BufferedWriter;
import java.io.FileWriter;

public class writingfile{
  public static void main(String[] args){

    try
    {
    BufferedWriter bw = new BufferedWriter(new FileWriter("Studentdata.csv"));
    bw.write("Name, Age, Total Marks, Class");
    bw.newLine();
    bw.close();
    }
          
    catch(Exception e){
    System.out.println(e);
          }
  }
}
