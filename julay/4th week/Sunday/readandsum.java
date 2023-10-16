
  import java.io.BufferedReader;
import java.io.FileReader;

public class readandsum {
    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new FileReader("sample.csv"));
        int line;
        br.read();
        while ((line=br.read())!=null) {
        //    System.out.println(line);
        int[] data = (int[])line.split(",");
        int n = data[1];
        System.out.println(n); 
            
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}

