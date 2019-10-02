import java.util.*;
public class MultiplicationTable{
  public static void main(String[] args){
    Scanner userInput=new Scanner(System.in);
    System.out.println("Enter the digit you want to print multiplication table");
    int input=userInput.nextInt();
    multiplicationTableDisplay(input);
  }
  public static void multiplicationTableDisplay( int num){
    for(int i=1;i<=10;i++)
    {
      int val=num*i;
      System.out.println(num+ "*"+ i+"="+val);
    }
  }

}
