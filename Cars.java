public class Cars extends Vehicles{
  int kmCount;

  public Cars(int weight,int price,int kmCount){
    super(weight,price);
    setKmCount(kmCount);
  }

  public void setKmCount(int kmCount){
    this.kmCount=kmCount;
  }

  public int getKmCount(){
    return kmCount;
  }

  public void drive(int kms){
    kmCount+=kms;
  }

  public String toString(){
    return " Weight : "+this.weight+" Price : "+this.price+" Kilometer Count : "+this. getKmCount();
  }

}
