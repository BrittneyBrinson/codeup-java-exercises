package shapes;

class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(int theLength, int theWidth) {
        super(theLength, theWidth);
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
