import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Time{
  private int h,m,s;

  public Time(int h){
    if(h>24 || h<0)
    throw new IllegalArgumentException ("Time: Bad value:" + h);
    else
    this.h=h;
  }
  public Time(int h, int m){
    if(h>24 || m>60|| h<0|| m<0)
    throw new IllegalArgumentException ("Time: Bad value:" + h + ":" + m);
    else
    this.h=h;
    this.m=m;
  }
  public Time (int h, int m, int s){
    if(h>24 || m>60 || s>60 || h<0 || m<0 || s<0)
    throw new IllegalArgumentException ("Time: Bad value:" + h + ":" + m +":" + s);
    else
    this.h=h;
    this.m=m;
    this.s=s;
  }

  public void setHour(int newHour){
    if(newHour>24 || newHour<0)
    throw new IllegalArgumentException ("Time: Bad hour value: " + newHour+"---Not updated!!");
    else
    h=newHour;
  }
  /*Incrementing hour value*/
  public void incHour(){
    if(h==24)
      h=0;
    else
      h++;
  }
  public int getHour(){
      return h;
  }


  public void setMinute(int newMinute){
    if(newMinute>60 || newMinute<0)
    throw new IllegalArgumentException ("Time: Bad  minutes value: " + newMinute+"---Not Updated!!");
    else
    m=newMinute;
  }
  /*Incrementing Minute value*/
  public void incMinute(){
    if(m==59 && h!=23 ){
      h++;
      m=0;
    }
      else if(m==60 && h==23){
        h=0;
        m=0;
      }
        else
          m++;
  }
  public int getMinute(){
      return m;
  }

  public void setSecond(int newSecond){
    if(newSecond>60 || newSecond<0)
    throw new IllegalArgumentException ("Time: Bad  Seconds value: " + newSecond+"---Not Updated!!");
    else
    s=newSecond;
  }
  /*Incrementing Seconds value*/
  public void incSecond(){
    if(s==59 && m!=59){
      m++;
      s=0;
    }
      else if(s==59 && m==59){
        s=0;
        m=0;
      }
        else
          s++;
  }
  public int getSecond(){
      return s;
  }

  public String toString(){
      Date dt = new Date();
      SimpleDateFormat dateFormat;
      dateFormat = new SimpleDateFormat("HH:mm:ss");
      String str =dateFormat.format(dt);
      return "Time in 24 hr format = "+str;
    }
  public String toString12(){
    Date dt = new Date();
    SimpleDateFormat dateFormat;
    dateFormat = new SimpleDateFormat("hh:mm:ss aa");
    String str1 =dateFormat.format(dt);
    return "Time in 12 hr format = "+str1;

  }
  public boolean isAm(){
    Format formatter = new SimpleDateFormat("aa");
    String s = formatter.format(new Date());
    // System.out.println(s);
    if(s=="am")
      return true;
      else
      return false;

  }

}
