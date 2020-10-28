public class Shape{
  String color;
  boolean filled;

  public Shape(){
    // this.color="red";
    // this.filled= true;
    this("red",true);
  }

  public Shape(String color,boolean filled){
    this.color=color;
    this.filled=filled;
  }
  public void  setColor(String color){
    this.color=color;
  }

  public String getColor(){
    return this.color;
  }

  public void setFilled(boolean filled){
    this.filled=filled;
  }

  public boolean isFilled(){
    return this.filled;
  }

  public double getArea(){
    return 0;

  }

  public double getPerimeter(){
    return 0;

  }

  public String toString(){
    return "Color :"+color+"\nIs filled or not ?:"+filled;

  }

}
