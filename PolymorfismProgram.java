public class PolymorfismProgram{
  public static void main(String[] args){
  Computer c1=new Computer("Alan Turing");
  c1.printYourInventer();

  Pc p1=new Pc("Bill gates");
  p1.printYourInventer();

  Computer c2=new Pc("Bill gates");
  c2.printYourInventer();

  Macintosh m1=new Macintosh("Steve & Steve");
  m1.printYourInventer();



  Computer c3=new Macintosh("Steve & Steve ");
  c3.printYourInventer();

  Macintosh m = (Macintosh)c3;
  m.doStuffWithComputer();

}

}
