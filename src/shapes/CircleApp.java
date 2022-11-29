package shapes;
import util.Input;

public class CircleApp {
    public static void main(String [] arguements)
    {
            var inputOne = new Input();
               var circleInfo = inputOne.getInt();

                System.out.println(circleInfo);
                    var newCircle = new Circle();

                    System.out.println( newCircle.getArea(circleInfo));

                        System.out.println(); newCircle.getCircumference(circleInfo);





    }
}
