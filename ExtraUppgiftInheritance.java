public class ExtraUppgiftInheritance {
  public static void main(String[] args){
    Cars c1=new Cars(1500,200000,5000);
    c1.drive(1200);

    // Boats b1=new Boats(2000,70000,"Monicka");
    // b1.go();
    // System.out.println("Boat details are :"+b1.toString());

     Aircrafts a1=new Aircrafts(10000,7500000,15000);
     a1.fly(true);

     Helicopters h1=new Helicopters(5000,950000,4000);
     h1.fly(true);

     System.out.println("------Seller details are ----");
     System.out.println("------Seller 1 ----");
     Seller se1=new Seller("Janet","Engineer",31,100000);
     c1.owner=se1;
     System.out.println(c1.owner.toString());
     System.out.println("Car details are :\n"+c1.toString());

     System.out.println("------Seller 2 ----");
     Seller se2=new Seller("Stephen","Business",45,750000);
     a1.owner=se2;
     h1.owner=se2;
     System.out.println(a1.owner.toString());
     System.out.println("Aircrafts details are :\n"+a1.toString());
     System.out.println("Helicopters details are :\n"+h1.toString());

     System.out.println("------Buyer details are ----");
     Buyer by1=new Buyer("Anna","Teacher",32,600000);
     Buyer by2=new Buyer("Maria","Business",35,50000000);
     Buyer by3=new Buyer("Luka","Actor",29,35000000);
     System.out.println("----Car buyer details are :\n"+by1.toString());
     System.out.println("----Aircraft buyer details are :\n"+by2.toString());
     System.out.println("----Helicopter buyer details are :\n"+by3.toString());

     System.out.println("------Vehicle Dealer details are ----");
     VehicleDealer vd1=new VehicleDealer("Adam john","Vehicle dealer",40,50000);
     System.out.println("---vehicle Dealer details are :\n"+vd1.toString());

     vd1.saleVehicle(c1,se1,by1);
     System.out.println("\n\n******After Car sale ******");
     System.out.println("Car owner deatils are :\n"+c1.owner.toString());
     System.out.println("Car seller deatils are :\n"+se1.toString());
     System.out.println("Vehicle dealer deatils are :\n "+vd1.toString());

     vd1.saleVehicle(a1,se2,by2);
     System.out.println("\n\n******After Aircraft sale ******");
     System.out.println("Aircraft  owner deatils are :\n"+a1.owner.toString());
     System.out.println("Aircraft  seller deatils are :\n"+se2.toString());
     System.out.println("Vehicle dealer deatils are :\n "+vd1.toString());

     vd1.saleVehicle(h1,se2,by3);
     System.out.println("\n\n******After Helicopter sale ******");
     System.out.println("Helicopter owner deatils are :\n"+h1.owner.toString());
     System.out.println("Helicopter seller deatils are :\n"+se2.toString());
     System.out.println("Vehicle dealer deatils are :\n "+vd1.toString());

  }
}
