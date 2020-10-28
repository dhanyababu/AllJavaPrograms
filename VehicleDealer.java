public class VehicleDealer extends Owner{

  public VehicleDealer(String name,String job,int age,int moneyAtBank){
    super(name,job,age,moneyAtBank);
  }

  public void saleVehicle(Vehicles v,Seller se,Buyer by){
    int dealerPercentage=(v.price*20)/100;
    by.moneyAtBank-=v.price;
    this.moneyAtBank+=dealerPercentage;
    se.moneyAtBank+=v.price-dealerPercentage;
    v.owner=by;
  }

}
