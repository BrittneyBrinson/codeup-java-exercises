package grades;
import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] arguments)
    {
        var studentA = new Student("Brittney");
            studentA.addGrade(98);
            studentA.addGrade(98);
            studentA.addGrade(75);

        var studentB = new Student("Frankie");
            studentB.addGrade(76);
            studentB.addGrade(80);
            studentB.addGrade(87);

        var studentC = new Student("Jake");
            studentC.addGrade(97);
            studentC.addGrade(89);
            studentC.addGrade(87);

        var studentD = new Student("Nikki");
            studentD.addGrade(88);
            studentD.addGrade(100);
            studentD.addGrade(84);

        HashMap<String, Student> students = new HashMap<>();
            students.put("BlueSky45",studentA);
            students.put("GreenPlatypus8",studentB);
            students.put("VeggieTales9", studentC);
            students.put("NeonStars1",studentD);

        System.out.println("Here are the Github usernames of the students");
        System.out.print("BlueSky45  |");
        System.out.print("GreenPlatypus8  |");
        System.out.print("VeggieTales9  |");
        System.out.println("NeonStars1");

        System.out.println("Which student would you like to see more information about?");
            Scanner scanner = new Scanner(System.in);
            String teacherSelection = scanner.nextLine();

            if(teacherSelection.equals("BlueSky45"))
            {
                System.out.println("Name: " + studentA.getName());
                System.out.println("Grades: " + studentA.getGrades());
                System.out.println("Grade-point Average: " + studentA.getGradeAverage());
            }
                else if(teacherSelection.equals("GreenPlatypus8 "))
                {

                }
    }
}
