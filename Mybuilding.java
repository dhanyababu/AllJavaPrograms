import java.util.*;
public class Mybuilding{
  public static void main(String[] args){
    House myHouse= new House();
    House yourHouse= new House();
    myHouse.changeAddress("IT gatan");
    yourHouse.changeAddress("IT gatan");
    myHouse=yourHouse;
    system.out.println(myHouse.showAddress());
    system.out.println(yourHouse.showAddress());

  }

}
