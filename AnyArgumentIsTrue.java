import java.util.*;
public class AnyArgumentIsTrue{
  public static void main(String[] args){
    System.out.println("Entered four truth value!");
    Scanner userInput=new Scanner(System.in);
    boolean t1=userInput.nextBoolean();
    boolean t2=userInput.nextBoolean();
    boolean t3=userInput.nextBoolean();
    boolean t4=userInput.nextBoolean();

    boolean val=anyIsTrue(t1,t2,t3,t4);
    if(val==true)
      System.out.println("You have entered on true value!");
      else
      System.out.println("You haven´t entered any true value!");
  }
  public static boolean anyIsTrue(boolean t1,boolean t2,boolean t3,boolean t4){
    if(t1||t2||t3||t4)
      return(true);
    else
      return(false);
  }

}
