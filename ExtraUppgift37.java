import java.util.*;
public class ExtraUppgift37{
  public static void main(String[] arags){
    char loopChar='y';
    Scanner userInput=new Scanner(System.in);
    do{
      System.out.println("1.Add two numbers\n2.count letters in a string\n3.flip a string\n4.sum all numbers in a string ");
      int caseValue=userInput.nextInt();
      switch(caseValue){
        case 1:
          addTwoNumbers();
          break;
        case 2:
          countLetters();
          break;
        case 3:
          reverseString();
          break;
        case 4:
          sumOfAllNumbers();
          break;
        default: System.out.println("Invalid case value");
          break;
      }
      System.out.println("Do you want to continue the program y/n:");
      loopChar=userInput.next().charAt(0);
    }while(loopChar!='n');
  }

  public static void addTwoNumbers(){
    // int num1,num2,sum;
    Scanner userNumbers=new Scanner(System.in);
    System.out.println("Here we can add two numbers");
    System.out.println("Enter first number");
    int num1=userNumbers.nextInt();
    System.out.println("Enter Second number");
    int num2=userNumbers.nextInt();
    int sum=num1+num2;
    System.out.println("Sum is :"+sum);
  }

  public static void countLetters(){
    System.out.println("Enter the word you want to search:");
    Scanner userInput=new Scanner(System.in);
    String searchWord=userInput.nextLine();
    System.out.println("Enter the letter you want to search :");
    char s = userInput.nextLine().charAt(0);
    int count = 0;
    for(int i=0;i<searchWord.length();i++) {
      if(searchWord.charAt(i)==s){
        count++;
      }
    }
    System.out.println("The word contains "+count+" times "+s);
  }

  public static void reverseString(){
    int left, right=0;
    System.out.println("Enter the String you want to reverse:");
    Scanner userInput=new Scanner(System.in);
    String reverseWord=userInput.nextLine();
    char[] temparray = reverseWord.toCharArray();
    right = temparray.length-1;
    for (left=0;left<right;left++,right--){
           char temp = temparray[left];
           temparray[left] = temparray[right];
           temparray[right]=temp;
       }
    for (int i=0;i<temparray.length;i++)
    System.out.print(temparray[i]);
    System.out.println("");
  }

  public static void sumOfAllNumbers(){
    int sum=0;
    System.out.println("Enter the String you want to count numbers:");
    Scanner userInput=new Scanner(System.in);
    String countString=userInput.nextLine();
    for(int i=0; i<countString.length(); i++) {
      char temp = countString.charAt(i);
      if (Character.isDigit(temp)) {
        int b = Integer.parseInt(String.valueOf(temp));
        sum=sum+b;
      }
    }
    System.out.println("sum of digitd in the string is"+sum);
  }


}
