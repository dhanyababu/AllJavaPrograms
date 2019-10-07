public class ExtraUppgift40{
  static String checkAddress="";
  public static void main(String[] args){
    Person p1=new Person("David","Engineer","Male",175,35);
    Person p2=new Person("Michael","lärare","Male",170,37);
    Person p3=new Person("Maria","lärare","Female",162,31);
    House h1=new House(140,2,500000,1985,"Fruktträdsgatan 1");
    House h2=new House(85,4,350000,2010,"Björlanda vägen");
    CarModel c1=new CarModel("Volvo",150000,12000);
    CarModel c2=new CarModel("Audi",250000,10000);
    p1.home = h1;
    p2.home = h2;
    p3.home =h2;
    h1.carModel = c1;
    h2.carModel = c2;
    after20Years(p1);
    after20Years(p2);
    after20Years(p3);

  }

  public static void after20Years(Person p){
    System.out.println("\n"+"**********AT BEGINNING**********"+"\n");
    System.out.println(p.toString());
    if(!(checkAddress.equals(p.home.address))){
      System.out.println(p.home.toString());
      System.out.println(p.home.carModel.toString());
    }
    else{
      System.out.println(p.name+" is living with someone else ,printed early!!");
    }
    /*Calculating age after 20 years and calculating house and car value if person living independently*/
    for(int i=0;i<20;i++){
      p.increaseAge();
      if(!(checkAddress.equals(p.home.address))){
        p.home.increaseValue();
        p.home.carModel.reduceValue();
      }

    }
    checkAddress=p.home.address;

    System.out.println("\n"+"**********AFTER 20 YEARS**********"+"\n");
    System.out.println(p.toString());
    System.out.println(p.home.toString());
    System.out.println(p.home.carModel.toString());

    }


}
