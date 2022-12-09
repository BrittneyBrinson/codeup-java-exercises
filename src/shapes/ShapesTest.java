package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        var box1 = new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        var box2 = new Rectangle(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        //POLYMORPHISM - when overloading a method from the parent class with either the same or different parameters but with the same name... the difference between the two is the type of object passed to them. This method was passed a SQUARE object. The one above was passed a RECTANGLE object. OVERRIDING is a form of POLYMORPHISM !
//        var box3 = new Square(6);
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());

        Measurable myShape;
         myShape = new Square(6,8);
        System.out.println(myShape.getArea());
        System.out.println(myShape); // I can't call the getLength or getWidth methods on myShape because of its TYPE, Which happens to be an abstract class named MEASURABLE and has NO method implementations(no body).





    }


}
