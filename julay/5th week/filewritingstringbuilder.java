import java.io.FileWriter;

public class filewritingstringbuilder {
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    sb.append("Hi this is FSD class").append(System.lineSeparator());
    sb.append("we are learning java").append(System.lineSeparator());
    try{
      FileWriter file = new FileWriter("data1.csv");
      file.write(sb.toString());
      file.close();
    }
    catch(Exception e){
      
    }
  }
}
