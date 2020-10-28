public class PolymorphismUppgift{
  public static void main(String[] args){
    Circle c1=new Circle(3,"yellow",false);
    System.out.println("****Circle***"+c1.toString());

    Rectangle r1=new Rectangle(10,12);
    System.out.println("***Rectangle***"+r1.toString());

    Square s1=new Square(2);
    System.out.println("***Square***"+s1.toString());

  }
}
