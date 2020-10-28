public class Aircrafts extends Vehicles{
  private int height;
  public Aircrafts(int weight,int price,int height){
    super(weight,price);
    setHeight(height);
  }
  public void setHeight(int height){
    this.height=height;
  }

  public int getHieght(){
    return height;
  }

  public void fly(boolean isFlying){
    if(isFlying)
      height+=height;
      else{
        height=0;
        System.out.println("----Aircraft landed----");
      }
  }

  public String toString(){
    return " Weight : "+this.weight+" Price : "+this.price+" Aircraft flying height : "+this.getHieght();
  }

}
