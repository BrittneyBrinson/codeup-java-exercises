package shapes;
import util.Input;

public class Circle {
    private double radius;

    public Circle(double radius)
    {  // Setter/ Constructor
        this.radius = radius;
    }
    public Circle()
    {

    }

    public double getArea(double radius){
        this.radius = Math.PI * (Math.pow(radius, 2));
        return this.radius;
    }

    public double getCircumference(double radius){
        this.radius = 2 * Math.PI * radius;
        return this.radius;
    }


}
