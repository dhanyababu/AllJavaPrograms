public class CarWashProgram{
  public void washCar( Car c){
    if(!c.insured)
      System.out.println("The car is not insured ,Sorry not possible to wash");
      else if (c.insured && c.washed)
        System.out.println("The car is already washed");
        else{
          c.washed=true;
          System.out.println("The car has been washed");
        }

    }
}
