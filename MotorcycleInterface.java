import java.util.*;
public class MotorcycleInterface extends MovingObject{
  Scanner uI=new Scanner(System.in);

  public MotorcycleInterface(int fuel,int speed){
    super(fuel,speed);
  }
  
  public void stopForFood(String food){
    System.out.println("A nice stop for refueling and eating "+food);
    System.out.println("Enter the amount of fuel you want to fill");
    int fuelToFill=uI.nextInt();
    this.fuel+=fuelToFill;
  }

  public void honk(){
    System.out.println("Peeee!");
  }
}
