public class Main {
    public static void main(String[] args) {

        double totalMarks = 700;
        double studentMarks = 650;
        double studentMarksPercent = (650 * 100) / 700;
        System.out.println(studentMarksPercent);

        if(studentMarksPercent > 90 && studentMarksPercent < 100) {
            System.out.println("you got A Grade, GPA = 4.0");
        }
        else if(studentMarksPercent > 80 && studentMarksPercent < 89) {
        System.out.println("you got B Grade, GPA = 3.0");
        }
        else if(studentMarksPercent > 70 && studentMarksPercent < 79) {
            System.out.println("you got C Grade, GPA = 2.0");
        }
        else if(studentMarksPercent > 60 && studentMarksPercent < 69) {
            System.out.println("you got D Grade, GPA = 1.0");
        }
        else if(studentMarksPercent < 59) {
            System.out.println("you got F Grade, GPA = 0");
        }
        else {
        }
}
}

