import java.util.*;
import java.lang.*;
public class FourGame{
  public static void main(String[] args){
    Scanner userInput=new Scanner(System.in);
    Board b=new Board(6,8);
    b.show();
    ArrayList<PlayerFG> playerList=new ArrayList<PlayerFG>();
    playerList=createPlayers();
    turn(b,playerList);
    // char getval=b.get(2,1);
    // System.out.println("returned value in (2,1)"+getval);
    // b.set(2,1);
    // b.clear(2,1);
  }
/*Creating Player List and returning created player list*/
  private static ArrayList<PlayerFG> createPlayers(){
    ArrayList<PlayerFG> createPlayerList=new ArrayList<PlayerFG>();
    Scanner userInput=new Scanner(System.in);
    System.out.println("how many players want to play");
    int numberOfPlayers=userInput.nextInt();
    for(int i=0;i<numberOfPlayers;i++){
      System.out.println("Enter Name of player : ");
      Scanner userInput1=new Scanner(System.in);
      String newName=userInput1.nextLine();
      System.out.println("Enter character you want to chose for player : ");
      char chooseChar=userInput1.next().charAt(0);
      createPlayerList.add(new PlayerFG());
      createPlayerList.get(i).setPlayer(newName,chooseChar);
    }
      return createPlayerList;
  }
/*placing character one by one in the board*/
  public static void turn(Board b,ArrayList<PlayerFG> players){
    boolean flag= true;
    Scanner userInput=new Scanner(System.in);
    do{
      Loop:
      for(int i=0;i<players.size();i++){
        System.out.println("     " +players.get(i).name +": please enter column value between 1-8 ");
        int playerColumnVal=userInput.nextInt();
        if(playerColumnVal>=9||playerColumnVal<=0){
           System.out.println("Invalid column value! column value range between 1-8");
/*if a player entered invalid column value ,then turn will goto next player*/
           continue Loop;
        }
        else{
          b.dropPiece(players.get(i).symbol,playerColumnVal);
          b.show();
          Checker.checkRows(players.get(i).symbol,b);
          Checker.checkColumns(players.get(i).symbol,b);
           Checker.checkDiagonalRight(players.get(i).symbol,b);
          Checker.checkDiagonalLeft(players.get(i).symbol,b);
          if(Checker.win==true){
            System.out.println("     "+players.get(i).name+" WIN the Game!!");
            break;
          }
        }
        if(b.boardFilled==false)
          break;
     }
   }while(b.boardFilled==true);
   System.out.println("     Game Over!!");
  }
}
