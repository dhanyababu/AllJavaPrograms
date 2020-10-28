import java.util.*;
public class ExtraUppgift42{
  public static void main(String[] args){
    Time t1=new Time(21,30,03);
    // t1.setHour(73);
    System.out.println(t1.getSecond());
    System.out.println(t1.getMinute());
    System.out.println(t1.getHour());
    System.out.println("Entered Time is  :"+t1.getOtherTime());

    System.out.println("Current Time in 24 hr format  :"+t1.toString());
    System.out.println(t1.toString12());
    if(t1.isAm())
      System.out.println(" ** Current Time is AM now ** ");
      else
        System.out.println(" ** Current Time is PM now ** ");

    //t1.incHour();
    //t1.incMinute();
    t1.incSecond();

    // System.out.println(t1.getSecond());
    // System.out.println(t1.getMinute());
    // System.out.println(t1.getHour());
    System.out.println("Entered time after Incrementing  :"+t1.getOtherTime());
    int diffValue= t1.compareTo(t1);
    System.out.println("Compared Value is  :"+diffValue);
    if(diffValue<0)
      System.out.println("Current time is less than other Time");
      else if(diffValue>0)
        System.out.println("Current time is greater than other time");
        else
          System.out.println("Both time is equal");
  }
}
