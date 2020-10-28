import java.util.*;
public class Die{
   int currentValue=0,numberOfSides;
   private static Random randomGenerator =new Random();

   public Die(int numberOfSides){
    this.numberOfSides=numberOfSides;
   }

   public int getNumberOfSides(){
     return numberOfSides;
   }

   public void roll(){
    currentValue=randomGenerator.nextInt(numberOfSides)+1;
   }
   
   public int getCurrentValue(){
     return currentValue;
   }
}
