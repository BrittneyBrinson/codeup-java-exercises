package shapes;

// Extends keywords makes the SQUARE class a SUBCLASS of the Rectangle class. Making Rectangles a SUPERCLASS
class Square extends Rectangle {

    public Square(int side) {
        super(side);

    }

    public int getArea(int side) {
        return side ^ 2;
    }

    public int getPerimeter(int side) {
        return 4 * side;
    }


}
