import java.util.*;
public class CarWash{
  public static void main(String[] args){
    Car c1=new Car("VolvoXC90",2012,true,false);
    CarWashProgram cw1=new CarWashProgram();
    cw1.washCar(c1);
  }
}
