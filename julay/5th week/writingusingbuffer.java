import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;


public class writingusingbuffer {
  public static void main(String[] args){ 
     String f1 = "Studentdata.csv";
    try
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(f1,true)); 
        File f = new File (f1);
        if(f1.length()==0){
                  writer.newLine();
         writer.write("name, age, city");

        }
  
         writer.newLine();
         writer.write("Dileep, 22, andhra");
         

    }
    catch(Exception e){
      
    }
      }
  }
  

