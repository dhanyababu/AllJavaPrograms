import java.lang.*;
public class Circle extends Shape{
  private double radius;

  public Circle(){
    super();
  }

  public Circle(double radius){
    super();
    setRadius(radius);
  }

  public Circle(double radius,String color,boolean filled){
    super(color,filled);
    setRadius(radius);
  }

  public void setRadius(double radius){
    this.radius=radius;
  }

  public double getRadius(){
    return this.radius;
  }

  @Override
  public double getArea(){
    double area=Math.PI*Math.pow(radius,2);
    return area;
  }

  @Override
  public double getPerimeter(){
    double perimeter=2*Math.PI*radius;
    return perimeter;
  }

  @Override
  public String toString(){
    return "\nArea :"+this.getArea()+"\nPerimeter is :"+this.getPerimeter()+"\nColor :"+this.color+"\nIs filled or not ?:"+this.filled;
  }



}
