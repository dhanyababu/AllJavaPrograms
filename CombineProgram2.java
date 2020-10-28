import java.util.*;
public class CombineProgram2{
  public static ArrayList<String> arrayList=new ArrayList<String>();
    public static void main(String[] args){
      int lengthOfList=0;
      char loopChar='y';
      Scanner userInput=new Scanner(System.in);
      do{
      System.out.println("Choose One case:\n1:Pascal´s Triangle\n2:The alphabet\n3:Create title list\n4:Enter names in title list\n5:Print title list\n6:Exit the program");
      int caseValue=userInput.nextInt();
      switch(caseValue){
        case 1:
          System.out.println("Enter Pascal´s Triangle level:");
          int levels=userInput.nextInt();
          writePascalTriangle(levels);
          break;
        case 2:
          System.out.println("how many number of alphabet do you need to be print");
          int number=userInput.nextInt();
          alphabetPrint(number);
          break;
        case 3:
          System.out.println("Enter the length of the list");
          lengthOfList=userInput.nextInt();
          // createList(lengthOfList);
          break;
        case 4:
          // Scanner userInput=new Scanner(System.in);
          System.out.println("Enter Names  :") ;
          System.out.println("Enter the length of the list");
          String enteredString=userInput.nextLine();
          insertNewName(enteredString,lengthOfList);
          break;
        case 5:
          printNameList ();
          break;
        case 6:
          System.exit(0);
          break;
        default: System.out.println("Invalid case value");
          break;
          }
            System.out.println("Do you want to continue the program y/n:");
            // Scanner userInput1=new Scanner(System.in);
            loopChar=userInput.next().charAt(0);
        }while(loopChar!='n');


    }

    public static void alphabetPrint(int number){
        char ch = 'a';
        for(int i=0;i<number;i++){
            System.out.println(ch++);
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

    // public static void createList(int lengthOfList){
    //   arrayList.length=lengthOfList;
    // }

    public static void insertNewName(String enteredName,int lengthOfList){
      if(arrayList.size()==lengthOfList)
        System.out.println("End of file");
      else
        arrayList.add(enteredName);
    }

    public static void printNameList(){
      for(int i=0;i<arrayList.size();i++)
      System.out.println(arrayList.get(i));
    }



  }
