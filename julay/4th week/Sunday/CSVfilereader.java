import java.io.BufferedReader;
import java.io.FileReader;

public class CSVfilereader {
    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new FileReader("sample.csv"));
        String line;
        br.readLine();
        while ((line=br.readLine())!=null) {
        //    System.out.println(line);
        String[] data = line.split(",");
        String n = data[0];
        System.out.println(n); 
            
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}