public class Korvmojj {
  public int amountOfSausages=1;
  public void feedPerson(Person p){
    if((amountOfSausages>0)&&(p.hungry)){
        amountOfSausages--;
        p.hungry=false;
      }
      else
      System.out.println("Sorry not enough sausage");
    }
}
