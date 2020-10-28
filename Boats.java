import java.util.Random;
  public class Boats extends Vehicles{
  private String gpsPosition;
  int x,y;

  Random random=new Random();

  public Boats(int weight,int price){
    super(weight,price);
    // setGPS(gpsPosition);
  }

  // public void setGPS(int gpsPosition){
  //   this.gpsPosition=gpsPosition;
  // }

  public String getGPS(){
    return "["+x+","+y+"]";
  }

  public void go(){
      x=random.nextInt(100)+1;
      y=random.nextInt(100)+1;

  }
  public String toString(){
    return " Weight : "+this.weight+" Price : "+this.price+" GPS Position : "+this.getGPS();
  }


}
