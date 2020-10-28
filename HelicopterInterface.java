import java.util.*;
public class HelicopterInterface extends MovingObject{
  Scanner uI=new Scanner(System.in);

  public HelicopterInterface(int fuel,int speed){
    super(fuel,speed);
  }

  public void land(){
    System.out.println("Enter the amount of fuel you want to fill");
    int fuelToFill=uI.nextInt();
    this.fuel+=fuelToFill;
  }
  public void adjustHeight(double height){
    System.out.println("Now plane hieght is "+height);
  }

}
