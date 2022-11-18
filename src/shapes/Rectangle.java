package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(){

    }

    public Rectangle(int length,int width){  // This is the object Rectangle's constructor, that accepts TWO parameters and SETS them as this OBJ length & width.
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public int getPeremeter(int length, int width){
        return 2 * length + 2 * width;
    }
}
