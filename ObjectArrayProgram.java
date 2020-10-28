public class ObjectArrayProgram{
  public static void main(String[] args){
  /*ObjectsOfArray ob=new ObjectsOfArray();
  ob.add(5);
  ob.add("Dhanya");
  ob.add(1988);
  ob.add("Object Array Program");
  ob.add('D');
  ob.add(2,"Babu");
  ob.get(3);
  ob.remove (3);
  ob.set(3,2019);
  ob.size();*/

  ObjArray ob=new ObjArray();
    ob.add(500);
    ob.add(10000.90);
    ob.add("Dhanya");
    ob.add(1988);
    ob.add("Creating java program");
    ob.add("Göteborg");
    ob.add(8,"Babu");
    ob.print();
    Object objvalue=ob.get(1);
    System.out.println("returned object in 1 position :"+objvalue);
    ob.remove(4);
    ob.print();
    ob.set(1,2019);
    ob.print();
    ob.size();
  }

}
