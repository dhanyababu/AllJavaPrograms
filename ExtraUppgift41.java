public class ExtraUppgift41 {
  public static void main(String[] args){
    System.out.println("---Number of Object Created at beginning");
    System.out.println(Person2.getCountOfObject());

     Person2 p1 = new Person2("Dhanya","Babu",31);
     Person2 p2 = new Person2("Caroline","Johannan",45);
     Person2 p3 = new Person2("juli","guftav",27);
/*P1 :Firstname Lastname and Age changed*/
     p1.setAge(25);
     p1.setFirstName("Maria");
     p1.setLastName("Johansson");
     System.out.println("---P1 :Firstname Lastname and Age changed");
     System.out.println(p1.getFirstName());
     System.out.println(p1.getLastName());
     System.out.println(p1.getAge());
 /*P2 :Age changed if it is not in between 1 and 100,the set to 20*/
     p2.setAge(205);
     System.out.println("---P2 :Age changed to 205");
     System.out.println(p2.getFirstName());
     System.out.println(p2.getLastName());
     System.out.println(p2.getAge());
/*P3 :Firstname and Lastname changed */
     p3.setName("Olivia","Anderson");
     System.out.println("---P3 :Firstname Lastname changed");
     System.out.println(p3.getFirstName());
     System.out.println(p3.getLastName());
 /*P3 :Again Firstname changed */
     p3.setName("Kristen");
     System.out.println("---P3 :Again Firstname changed");
     System.out.println(p3.getFirstName());
     System.out.println(p3.getLastName());

     System.out.println("---Number of Object Created");
     System.out.println(p1.getCountOfObject());

  }
}
