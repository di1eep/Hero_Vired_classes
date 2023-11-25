import java.io.BufferedReader;
import java.io.FileReader;


public class StudentReportFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("StudentReport.csv"));
            

            String line;

            System.out.println("*****************************************");
            System.out.println("===============REPORT CARD===============");
            System.out.println("*****************************************");

            br.readLine(); // read from line no. 2 cursor will shift to 2nd line

            int maxInMath = 0;
            int maxInSci = 0;
            int maxInEng = 0;

            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                String[] data = line.split(",");
                String name = data[0];
                String subMath = data[1];
                int mathMarks = Integer.parseInt(data[2].trim()); // trim is used to remove whitespaces
                String subScience = data[3];
                int scienceMarks = Integer.parseInt(data[4].trim());
                String subEnglish = data[5];
                int englishMarks = Integer.parseInt(data[6].trim());
                String teacherFeedback = data[7];

                int totalMarks = mathMarks + scienceMarks + englishMarks;
                double averageMarks = totalMarks / 3;
                double percentage = (totalMarks / 300.0) * 100;
                String grade;
                int gradePercent = (int) percentage / 10;

                // maximum of each subject
                maxInMath = Math.max(maxInMath, mathMarks);
                maxInSci = Math.max(maxInSci, scienceMarks);
                maxInEng = Math.max(maxInEng, englishMarks);

                // Using if--else statement
                // if (percentage >= 90) {
                // grade = "A+";
                // } else if (percentage>= 80) {
                // grade = "A";
                // } else if (percentage >= 70) {
                // grade = "B";
                // } else if (percentage >= 60) {
                // grade = "C";
                // } else {
                // grade = "F";
                // }

                // Using switch case
                switch (gradePercent) {
                    case 9:
                        grade = "A+";
                        break;
                    case 8:
                        grade = "A";
                        break;
                    case 7:
                        grade = "B";
                        break;
                    case 6:
                        grade = "C";
                        break;
                    default:
                        grade = "F";
                        break;
                }

                System.out.println("Name: " + name);
                System.out.println("Marks in " + subMath + " are : " + mathMarks);
                System.out.println("Marks in " + subScience + " are : " + scienceMarks);
                System.out.println("Marks in " + subEnglish + " are : " + englishMarks);
                System.out.println("Total Marks are: " + totalMarks);
                System.out.println("Average is: " + averageMarks);
                System.out.println("percentage: " + percentage);
                System.out.println("Grade: " + grade);
                System.out.println("Teacher's Feedback: " + teacherFeedback);
                System.out.println("===============================");
            }

            // Printing maximum after getting all entries
            System.out.println("Maximum marks in Math: " + maxInMath);
            System.out.println("Maximum marks in Science: " + maxInSci);
            System.out.println("Maximum marks in English: " + maxInEng);

            // rank based on percentage

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// take out max in every subject
// based on total marks take out rank
