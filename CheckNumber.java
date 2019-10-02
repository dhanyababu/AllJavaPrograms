import java.util.*;
public  class CheckNumber{
	static int flag=0;
	public static void main(String[] args) {

    Scanner userInput= new Scanner(System.in);
    //boolean flag=true;

    while(flag==0){
    System.out.println("enter a number between 0 and 10");
    int num=userInput.nextInt();
    checkNumberInterval(num);
    }
  }
  public static void checkNumberInterval(int num){
    if(num>=0 && num<10){
      System.out.println("Congratulations!! you entered correctly..");
      //return(false);
			flag=1;
    }
    else{
      System.out.println("Oops!! you entered wrong number..");
      //return(true);

    }
  }
}
