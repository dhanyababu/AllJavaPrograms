import java.util.*;
public class CarInterface extends MovingObject{
  Scanner uI=new Scanner(System.in);

  public CarInterface(int fuel,int speed){
    super(fuel,speed);
  }

  public void stopForFood(String food){
    System.out.println("A nice stop for refueling and eating "+food);
    System.out.println("Enter the amount of food you want to fill");
    int fuelToFill=uI.nextInt();
    this.fuel+=fuelToFill;
  }

  public void honk(){
    System.out.println("Beep!");
  }
  
}
