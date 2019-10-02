import java.util.*;
public class AverageNumber{
  public static void main(String[] args){
    System.out.println("Enter two integers");
     int number1=fetchInteger();
     int number2=fetchInteger();
     float averageOfNumber=calculateAverage(number1,number2);
     System.out.println("Average is "+averageOfNumber);

  }
  public static int fetchInteger(){
    Scanner input= new Scanner(System.in);
    int userInput=input.nextInt();
    return(userInput);
  }
  public static float calculateAverage(int num1,int num2){
    float avgNumber=(float)(num1+num2)/2;
    return(avgNumber);
  }
}
