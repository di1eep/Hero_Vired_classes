import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class updateStudentData {
    public static void main(String[] args) {
        try {
            BufferedReader objBufferedReader = new BufferedReader(new FileReader("studentDatabase.txt"));
            String studentData = "";
            String updatedStudentData = "";
            while ((studentData = objBufferedReader.readLine()) != null) {
                // studentData = "1,ABC,12"; => rollno = "1"; name = "ABC"; marks = "12"
                // studentData = "2,DFR,15";
                // studentData = "3,RRR,14";
                // studentData = "4,TFE,16";
                // studentData = "5,YHJ,18";

                String rollNo = studentData.substring(0, studentData.indexOf(",")); // "1";
                studentData = studentData.substring(studentData.indexOf(",") + 1); // "ABC,12";

                String name = studentData.substring(0, studentData.indexOf(",")); // "ABC";
                studentData = studentData.substring(studentData.indexOf(",") + 1); // "12";

                String marks = studentData; 
                
                // System.out.println("Data for each student: " + rollNo + ": " + name + ": " + marks);

                if(rollNo.equals("4") ){
                    marks = "19";
                }
                // System.out.println("Data for each student: " + rollNo + ": " + name + ": " + marks);
                updatedStudentData += (rollNo + "," + name + "," + marks + "\n");
            }
            System.out.println(updatedStudentData);
            objBufferedReader.close();

            FileWriter objFileWriter = new FileWriter("studentDatabase.txt");
            objFileWriter.write(updatedStudentData);
            objFileWriter.close();

        } catch (Exception e) {
            System.out.println("Error while writing into a file: " + e.getMessage());
        }

    }
}
