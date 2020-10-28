public class Square extends Rectangle{
  private double side;

  public Square(){
    super();
  }

  public Square(double side){
    super(side,side);
    setSide(side);
  }

  public Square(double side,String color,boolean filled){
    super(side,side,color,filled);
    setSide(side);
  }

  public void setSide(double side){
    super.setWidth(side);
    super.setLength(side);
  }

  public double getSide(){
    return super.getWidth();
    // return this.side;
  }

  @Override
  public void setWidth(double side){
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public void setLength(double side){
    super.setLength(side);
    super.setWidth(side);
  }

  @Override
  public String toString(){
    return "\n Area :"+this.getArea()+"\nPerimeter is :"+this.getPerimeter()+"\nColor :"+this.color+"\nIs filled or not ?:"+this.filled;
  }

}
