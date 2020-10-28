public abstract class MovingObject implements VehicleInterface{
  int fuel,speed,distanceTravelled;
  public MovingObject(int fuel,int speed){
    this.fuel=fuel;
    this.speed=speed;
  }
  public void move(int hours){
      if(fuel!=0){
        int distance=speed/hours;
        this.distanceTravelled+=distance;
      }
      else
        System.out.println("No fuel");
  }

 public int getFuel(){
   return this.fuel;
 }

 public int getDistanceTravelled(){
   return this.distanceTravelled;
 }
}
