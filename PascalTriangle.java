import java.util.*;
public class PascalTriangle{
    public static void main(String[] args){
      Scanner userInput=new Scanner(System.in);
      System.out.println("Enter Pascal´s Triangle level:");
      int levels=userInput.nextInt();
      writePascalTriangle(levels);
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
