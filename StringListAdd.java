import java.util.*;
public class StringListAdd{
  public static void main(String[] args){
    String prevString="";
    int flag=1;
    ArrayList<String> alist=new ArrayList<String>();
    Scanner userInput=new Scanner(System.in);
      do{
        System.out.println("Enter  a String :") ;
        String enteredString=userInput.nextLine();
        if(enteredString.length()>prevString.length()){
          alist.add(enteredString);
          prevString=enteredString;
          }
          else
          {
            alist.add(enteredString);
            System.out.println(alist);
            flag=0;
          }
        }while(flag!=0);
      }
}
