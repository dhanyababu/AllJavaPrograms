import java.util.*;
public class CreateArrayProgram{
  public static void main(String[] args){
    System.out.println("Enter array length");
    Scanner userInput=new Scanner(System.in);
    int arrayLength=userInput.nextInt();
    int[] intArray=new int[arrayLength];
    intArray=createArray(arrayLength);
    printArray(intArray);
    doubleUpArray(intArray);
  }
  public static int[] createArray(int x){
    int[] intCreateArray=new int[x];
    for(int i=0;i<intCreateArray.length;i++){
      System.out.println("Enter Array value");
      Scanner Input=new Scanner(System.in);
      int arrayValue=Input.nextInt();
      intCreateArray[i]=arrayValue;
    }
    return(intCreateArray);
  }

  public static void printArray(int[] arr){
    System.out.println("You entered array is ");
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }
 public static void doubleUpArray(int[] intArray) {
   int y=intArray.length*2;
   int[] doubleArray=new int[y];
   for(int i=0;i<intArray.length;i++){
     for(int j=0;j<doubleArray.length;j++){
       if(i==j)
       doubleArray[i]=intArray[j];
     }
   }
   System.out.println("double array is ");
   for(int i=0;i<doubleArray.length;i++)
   System.out.println(doubleArray[i]);

  }
}
