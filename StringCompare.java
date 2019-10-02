import java.util.*;
public class StringCompare{
  public static void main(String[] args){
  //  boolean flag=1
    int a;
    String previousString="";
    Scanner userInput=new Scanner(System.in);
do{
      String enteredString=userInput.nextLine();
      System.out.println("You entered string "+enteredString);
      a =previousString.compareTo(enteredString);
      previousString=enteredString;
  }while(a!=0);
}
}
