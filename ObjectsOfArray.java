import java.util.*;
public class ObjectsOfArray{
  public ArrayList<Object> objectList = new ArrayList<Object>();

  public void add(Object o){
      objectList.add(o);
      System.out.println(objectList);
  }
  public void add(int i,Object o){
    objectList.add(i,o);
    System.out.println(objectList);
  }

  public void get(int i){
    System.out.println(objectList.get(i));
  }

  public void remove (int i){
    objectList.remove(i);
    System.out.println("after removal of object : "+objectList);
  }

  public void set(int i, Object o){
    objectList.set(i,o);
    System.out.println("after setting of object"+objectList);
  }

  public void size (){
    System.out.println("No of elements in Arraylist :"+objectList.size());

  }

}
