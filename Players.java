import java.util.*;
public class Players{
  public String name;
  public int score;
  public ArrayList<Die> diceList=new ArrayList<Die>();

  public void setName(String name){
    this.name=name;
  }

  public void rollDice (){
      for(int i=0;i<diceList.size();i++){
          diceList.get(i).roll();
          System.out.println("    Dice value is :"+diceList.get(i).getCurrentValue());
      }
  }

  public void addDie(int sides){
      Die d = new Die(sides);
      diceList.add(d);
  }

  public int getScore(){
    return score;
  }

  public int getDieValue(){
    int sum=0;
    for(int i=0;i<DiceProgram.numberOfDice;i++){
        sum+=diceList.get(i).getCurrentValue();
      }
    return sum;
   }

   public void increaseScore (){
     score++;
   }

}
