public class Game{

  public void run(){
    System.out.println("Welcome to game");
    Scanner userInput=new Scanner(System.in);
    System.out.println("1:Go Adventuring\n2:Show details about your character\n3.Exit game");
    int optionValue=userInput.nextInt();
    Switch(optionValue){
      case 1:
      goAdventure();
      break;
      case 2:

      break;
      case 3:
        System.out.println("Bye");
        System.exit(0);
      default:
        System.out.println("Invalid choice");
    }
  }

  public void goAdventure(){
    battle(monster);


  }

}
