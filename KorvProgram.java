// import java.util.*;
public class KorvProgram {
  public static void main(String[] args){
    Person p1=new Person();
    Korvmojj korv=new Korvmojj();
    p1.firstName="albert";
    p1.lastName="simon";
    p1.age=30;
    p1.hungry=true;
    korv.feedPerson(p1);
    System.out.println("Person name is "+p1.firstName+p1.lastName);

    System.out.println("Person is now hungry?"+p1.hungry);
  }
}
