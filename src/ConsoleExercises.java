import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi + ".");
        System.out.printf("The value of pi is approximately %s", pi );
        System.out.println(" ");

        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
       int userInput = scanner.nextInt();

        System.out.println(userInput);
        System.out.println("Please enter 3 words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("You entered " + firstWord +" " + secondWord + " " + thirdWord);

        System.out.println("Please enter a sentence !");
        String nextSentence = scanner.next();
        System.out.println(nextSentence);

        System.out.println("Please enter a sentence !");
        String nextSentence2 = scanner.nextLine();
        System.out.println(nextSentence2);

        System.out.println("Please enter the length of your room");
        int roomLength = scanner.nextInt();
        System.out.println("Please enter the width of your room");
        int roomWidth = scanner.nextInt();
        int roomArea = roomWidth * roomLength;
        int roomPerimeter = (roomWidth * 2) + (roomLength * 2);
        System.out.println("The area of your room is " + roomArea);
        System.out.println("The perimeter of your room is " + roomPerimeter );
    }
}
