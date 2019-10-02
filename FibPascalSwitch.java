import java.util.*;
public class FibPascalSwitch{
    public static void main(String[] args){
      Scanner userInput=new Scanner(System.in);
      System.out.println("Choose One case:"+"\n"+"1:Fibnocci Series"+"\n"+"2:Pascal´s Triangle"+"\n"+"3:exit");
      int caseValue=userInput.nextInt();
      switch(caseValue){
        case 1:
        System.out.println("how many numbers in the series to be print");
        int number=userInput.nextInt();
        writeFibSeq(number);
        break;
        case 2:
        System.out.println("Enter Pascal´s Triangle level:");
        int levels=userInput.nextInt();
        writePascalTriangle(levels);
        break;
        case 3:
        System.exit(0);
        break;
        default: System.out.println("Invalid case value");
        }
    }

    public static void writeFibSeq(int number){
        int t1=1,t2=1;
        for(int i=0;i<number;i++){
            System.out.print(t1+"   ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
          }
    }

    public static void writePascalTriangle(int levels){
      int disp=1;
      for(int i=0;i<levels;i++){
          for(int k=1;k<=levels-i;k++)
              System.out.print(" ");
              for(int j=0;j<=i;j++){
                if (j==0||i==0)
                    disp=1;
                else
                   disp=disp*(i-j+1)/j;
                System.out.print(" "+disp);
            }
            System.out.print("\n");
        }

    }


  }
