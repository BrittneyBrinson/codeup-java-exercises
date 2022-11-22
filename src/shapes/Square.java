package shapes;

// Extends keywords makes the SQUARE class a SUBCLASS of the Rectangle class. Making Rectangles a SUPERCLASS
 class Square extends Quadrilateral{

  public Square(){
   System.out.println("New shape made");
  }
  public void setLength(int length){
   this.length = length;
  }

  public void setWidth(int width){
   this.width = width;
  }

  public double getPerimeter(){
   return 0;
  }

  public double getArea(){
   return 0;
  }



}
