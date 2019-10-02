import java.util.*;
public class BubbleSortingArray{
    public static void main(String[] args){
        System.out.println("Enter array Index");
        Scanner userInput= new Scanner(System.in);
        int indexVal=userInput.nextInt();
        int[] unsortedArray=new int[indexVal];
        int[] sortedArray=new int[indexVal];
        System.out.println("Enter array elements");
        for(int i=0;i<unsortedArray.length;i++)
            unsortedArray[i]=userInput.nextInt();
        System.out.println("Entered unSortedArray elements");
        for(int i=0;i<unsortedArray.length;i++)
            System.out.println(unsortedArray[i]);
          sortedArray=arraySorting(unsortedArray,indexVal);
          System.out.println("SortedArray elements :");
          for(int i=0;i<sortedArray.length;i++)
              System.out.println(sortedArray[i]);

  }
    public static int[] arraySorting(int[] arr,int n){
      for (int i = 0; i < n-1; i++){
      for (int j = 0; j < n-i-1; j++){
        if (arr[j] > arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
      }
    }
    return(arr);

    }
}
