package shapes;

 class Rectangle extends Quadrilateral implements Measurable{
    public void setLength(int length){              //SETTERS
         length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public double getPerimeter(){
        return 0;
    }

     @Override
     public double getArea() {
         return 0;
     }
 }
