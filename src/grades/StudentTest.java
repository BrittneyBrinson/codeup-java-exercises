package grades;

public class StudentTest {
    public static void main(String[] arguments)
    {
        var oneB = new Student("Brittney");

        oneB.addGrade(90);
        oneB.addGrade(89);
        oneB.addGrade(87);

        System.out.println( oneB.getGrades());
        System.out.println(oneB.getGradeAverage());

    }
}
