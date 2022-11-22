package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) //SETTER
    {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName()
    {   //GETTER
        return name;
    }

    public void addGrade(int grade)
    {
        grades.add(grade);
    }
    public ArrayList<Integer> getGrades() // GETTER
    {
        return grades;
    }

    public double getGradeAverage()
    {
        int sum = 0;
        for(int number : grades){
            sum = sum += number;
        }
        return sum/grades.size();
    }




}
