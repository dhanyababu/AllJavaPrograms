public class Rectangle extends Shape{
  private double width,length;

  public Rectangle(){
    super();
  }

  public Rectangle(double width,double length){
    super();
    setWidth(width);
    setLength(length);
  }

  public Rectangle(double width,double length,String color,boolean filled){
    super(color,filled);
    setWidth(width);
    setLength(length);
  }
  public void setWidth(double width){
    this.width=width;
  }

  public void setLength(double length){
    this.length=length;
  }

  public double getWidth(){
    return this.width;
  }

  public double getLength(){
    return this.length;
  }

  @Override
  public double getArea(){
    double area=this.length*this.width;
    return area;
  }

  @Override
  public double getPerimeter(){
    double perimeter=2*length+2*width;
    return perimeter;
  }

  @Override
  public String toString(){
    return "\n Area :"+this.getArea()+"\nPerimeter is :"+this.getPerimeter()+"\nColor :"+this.color+"\nIs filled or not ?:"+this.filled;
  }

}
