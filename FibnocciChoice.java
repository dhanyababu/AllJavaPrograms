import java.util.*;
public class FibnocciChoice{
    public static void main(String[] args){
      System.out.println("how many numbers in the series to be print");
      Scanner userInput=new Scanner(System.in);
      int number=userInput.nextInt();
      writeFibSeq(number);
    }

    public static void writeFibSeq(int number){
        int t1=1,t2=1;
        for(int i=0;i<number;i++){
            System.out.println(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
          }
    }
}
