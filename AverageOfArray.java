import java.util.*;
public class AverageOfArray{
  public static void main(String[] args){
    System.out.println("Enter array length");
    Scanner userInput=new Scanner(System.in);
    int arrayLength=userInput.nextInt();
    double[] doubleCreateArray=new double[arrayLength];
    System.out.println("Enter Array value");
      for(int i=0;i<arrayLength;i++){
      double arrayValue=userInput.nextDouble();
      doubleCreateArray[i]=arrayValue;
      }
    System.out.println("Entered Array is  :");
    for(int i=0;i<arrayLength;i++){
      System.out.println(doubleCreateArray[i]);
      }
    double avgValue=AvgOfDoubleArray(doubleCreateArray);
    System.out.println(" Double Array Average is " +avgValue);
}
  public static double AvgOfDoubleArray(double[] arr){
    double calcAvg=0.0,total=0.0;
    for(int i=0;i<arr.length;i++){
       total+=arr[i];
     }
    calcAvg=total/arr.length;
    return(calcAvg);
  }

}
