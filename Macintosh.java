public class Macintosh extends Computer{
  String oS;
  public Macintosh(String inventerName){
    super(inventerName);
  }

  public void doStuffWithComputer(){
    System.out.println("Operating System is "+this.oS);
  }

}
