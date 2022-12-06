package shapes;

 class Rectangle {
     protected int length;
     protected int width;

     public Rectangle(int setLength, int setWidth){
        length = setLength;
        width = setWidth;
     }

     public Rectangle(int side) {
        length = side;
        width = side;
     }

     public int getArea(){
         return length * width;
     }

     public int getPerimeter(){
         return 2 * length + 2 * width;
     }

 }
