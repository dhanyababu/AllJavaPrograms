public class TestProgramInterface{
  public static void main(String[] args){
    // BoatsInterface b1=new BoatsInterface(2000,150);
    //   b1.dock();
    //   testDrive(b1,40);
    //   System.out.println("Boat Current depth is "+b1.checkDepth());

    // CarInterface c1=new CarInterface(1000,110);
    //   c1.stopForFood("snacks");
    //   c1.honk();
    //   testDrive(c1,10);
    Plane p1=new Plane(1250,23000);
    p1.land();
    p1.adjustHeight(20000);
    testDrive(p1,10);

  }
  public static void testDrive(MovingObject object,int time){
    object.move(time);

    System.out.println("Fuel is "+object.getFuel());
    System.out.println("Distance travelled is "+object.getDistanceTravelled()+" Kilometer");
  }
}
