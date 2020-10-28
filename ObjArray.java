public class ObjArray{
  Object[] obArray=new Object[10];
  static int sizeCount=0;
  public void add(Object o){
    if(obArray.length<sizeCount){
      int doubleLength=obArray.length*2;
      Object[] obArray=new Object[doubleLength];
    }
      obArray[sizeCount]=o;
      sizeCount++;
  }
  public void add(int i,Object o){
    if(obArray.length<i){
      int doubleLength=obArray.length*2;
      this.obArray=new Object[doubleLength];
    }
    if(sizeCount<i)
      sizeCount=i;
    obArray[i]=o;
  }
  public void print(){

    System.out.println("Object Array is : ");
    for(int i=0;i<sizeCount+1;i++){
      System.out.println(obArray[i]);
    }
  }

  public Object get(int i){
    return obArray[i];
  }

  public void remove(int i){
    for(int j=i;j<sizeCount;j++){
         obArray[j]=obArray[j+1];
     }
     sizeCount=sizeCount-1;
  }
  public void set(int i,Object o){
    obArray[i]=o;
  }

  public void size (){
    System.out.println("No of elements in Arraylist :"+(sizeCount+1));
  }



}
