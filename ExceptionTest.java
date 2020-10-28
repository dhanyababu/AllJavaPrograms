import java.util.*;
import java.lang.*;
public class ExceptionTest{

 public static void main(String[] args){
   int flag=0;
  do{
    try{
      System.out.println("Age accepted: "+getAge());
      flag=1;
    }
    catch(Exception e){
      System.out.println("Wrong,try again!"+e.getMessage());
    }
  }while(flag==0);
 }

 public static int getAge() throws AgeIncorrectException{
   Scanner input=new Scanner(System.in);
   System.out.println("Enter your age :");
   int age=input.nextInt();
   if(age<0 || age>200){
    // throw new InputMismatchException("Invalid age");
    throw new AgeIncorrectException();
  }
   return age;
 }

}

class AgeIncorrectException extends Exception{
    public AgeIncorrectException(){
      super("Invalid Age");
    }

 }
