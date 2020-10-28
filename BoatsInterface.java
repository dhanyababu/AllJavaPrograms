import java.util.Random;
import java.util.*;
public class BoatsInterface extends MovingObject{
  Random random=new Random();
  Scanner uI=new Scanner(System.in);

  public BoatsInterface(int fuel,int speed){
    super(fuel,speed);
  }

  public void dock(){
    System.out.println("Enter the fuel amount you want to fill");
    int fuelToFill=uI.nextInt();
    this.fuel+=fuelToFill;

  }
  public int checkDepth(){
    int depth =random.nextInt(100)+1;
     // System.out.println("The depth of these waters are "+depth);
     return depth;
  }
}
