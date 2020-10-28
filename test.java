
import java.util.Random;

public class IncrementsNumber {
  public static void main(String args[]){
    System.out.println("...."+rValue(100));
  }

    public static int rValue(int n){
      public static int randomValue;
      //private static final int randomValue = 100
        Random random = new Random();
        randomValue = random.nextInt(n)+1;
        System.out.println("random value "+randomValue);
        return randomValue*10000;
    }



}
