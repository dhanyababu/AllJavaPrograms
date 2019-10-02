import java.util.*;
public class UserPasswordCheck{
  static int countVariable=0;
  public static void main(String[] args){
    while(countVariable<5){
      boolean val=isAuthorized();
      if(val==true){
        System.out.println("Congratulations!!All passwords are correct");
          if(countVariable==5)
            System.out.println("Alert!! Always remember password correctly");
            System.exit(0);
            }
          else if(countVariable==4)
                System.out.println("Warning!!one more chance..");
                else if(countVariable==5)
                  System.out.println("Sorry!!No more chance..");
  }
}
public  static boolean isAuthorized(){
    int count=0;
    String[] Str={"piggy","snuff","bark"};
    String[] passWord=new String[3];
    System.out.println("enter three passwords");
    Scanner userInput=new Scanner(System.in);
    passWord[0]=userInput.nextLine();
    passWord[1]=userInput.nextLine();
    passWord[2]=userInput.nextLine();
    countVariable++;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(passWord[i].equals(Str[j])){
          count++;
        }
      }
    }
    if(count==3)
      return(true);
    else
      return(false);
  }
}
