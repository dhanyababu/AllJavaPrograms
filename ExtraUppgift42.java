import java.util.*;
public class ExtraUppgift42{
  public static void main(String[] args){
    Time t1=new Time(2,59,59);
    // t1.setHour(73);
    t1.incSecond();
    // t1.incMinute();
     System.out.println(t1.getSecond());
     System.out.println(t1.getMinute());
     System.out.println(t1.getHour());

    System.out.println(t1.toString());
    System.out.println(t1.toString12());
    if(t1.isAm())
      System.out.println(" ** Time is AM now ** ");
      else
      System.out.println(" ** Time is PM now ** ");
      // t1.isAm();

  }
}
