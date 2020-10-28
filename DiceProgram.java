import java.util.*;
public  class DiceProgram{
  public static int numberOfDice;
    public static void main(String[] args){
      ArrayList<Players> newPlayerList=new ArrayList<Players>();
      ArrayList<Players> newPlayerList1=new ArrayList<Players>();
      newPlayerList=initialize();
      takeTurn(newPlayerList);
      newPlayerList1=getWinners(newPlayerList);
      if(newPlayerList1.size()!=0){
        System.out.println("\n\n*******WINNER is ********");
        for(int i=0;i<newPlayerList1.size();i++){
          System.out.println("NAME  : "+newPlayerList1.get(i).name+"  SCORE  : "+newPlayerList1.get(i).score);
        }
      }
      else
        System.out.println("\n\n*****Sorry!..No WINNER******");
    }
    /*Initialising arraylist and returning created new player list*/
    private static ArrayList<Players> initialize(){
      Scanner userInput=new Scanner(System.in);
      System.out.println("how many players want to play");
      int numberOfPlayers=userInput.nextInt();
      System.out.println("how many dice each player should have");
      numberOfDice=userInput.nextInt();
      System.out.println(" how many sides the dice should have");
      int numberOfSides=userInput.nextInt();
      ArrayList<Players> playerList=new ArrayList<Players>();
      for(int i=0;i<numberOfPlayers;i++){
        System.out.println("Enter the names of players");
        Scanner userInput1=new Scanner(System.in);
        String newName=userInput1.nextLine();
        playerList.add(new Players());
        playerList.get(i).setName(newName);
      }
      for(int i=0;i<numberOfPlayers;i++){
        for(int j=0;j <numberOfDice;j++)
            playerList.get(i).addDie(numberOfSides);
      }
        return playerList;
    }

/*Each player throwing their whole dice,
if the total value od dice and guessing value is same player will get 1 score.
total 5 chances for each player */
    private static void takeTurn (ArrayList<Players> players){
      Scanner userInput=new Scanner(System.in);
      for(int j=0;j<5;j++){
        for(int i=0;i<players.size();i++){
          System.out.println("****Player "+players.get(i).name+" Please Guess a value :");
          int guessValue=userInput.nextInt();
          System.out.println("    Now Played : "+players.get(i).name);
          players.get(i).rollDice();
          System.out.println("    Total value of dice is :"+players.get(i).getDieValue());
          if(guessValue==players.get(i).getDieValue())
            players.get(i).increaseScore();
            System.out.println("    Player  "+players.get(i).name+"   Score is   :"+players.get(i).getScore());
        }
      }
    }
/*Calculating maximum score,returning winners list*/
    private static ArrayList<Players> getWinners (ArrayList<Players> players){
      ArrayList<Players> maxPlayerList=new ArrayList<Players>();
      int maxScorevalue=0;
      for(int i=0;i<players.size();i++){
        if(players.get(i).getScore() >maxScorevalue)
          maxScorevalue=players.get(i).getScore();
        }
        for(int i=0;i<players.size();i++){
          if(players.get(i).getScore() == maxScorevalue && maxScorevalue!=0){
              maxPlayerList.add(players.get(i));
            }
        }
          return maxPlayerList;
      }
    }
