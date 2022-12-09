package shapes;

// Extends keywords makes the SQUARE class a SUBCLASS of the Rectangle class. Making Rectangles a SUPERCLASS
class Square extends Quadrilateral {

    public Square(int theLength, int theWidth){
        super(theLength,theWidth);
        this.length = theLength;
        this.width = theWidth;

    }


}
