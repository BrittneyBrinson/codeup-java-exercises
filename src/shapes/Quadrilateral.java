package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int theLength, int theWidth){
        length = theLength;
        width = theWidth;
    }

    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }

    public int setLength(){
        return this.length;
    }

    public int setWidth(){
        return this.length;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

