import java.util.*;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
    System.out.println("Enter the digit you want to check");
    int input=userInput.nextInt();
    boolean x=isEven(input);
		if(x==1)
		System.out.println("Number is even");
		else
		System.out.println("Number is Odd");


  }
  public boolean isEven(int num){
				if(num==0){
					System.out.println("Number is Zero..Obs!!");
					exit;
				}
				else if(num%2==0)
        		return(1);
        		else
        			return(0);
			}

}
