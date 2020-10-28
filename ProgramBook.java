public class ProgramBook{
  public static void main(String[] args){

    System.out.println("Number of Books Created is "+ Book.getNumberOfBooks());
    Book b1=new Book( "The Stand","Stephen King");
    Book b2=new Book("Wings Of Fire");
    Book b3=new Book( "The Stand","Stephen King");
    b1.setBook("Macbeth","Shakespeare");
    // b1.getTitle();
    // b1.getAuthor();

    System.out.println(b1.toString());
    System.out.println(b2.toString());
    System.out.println(b3.toString());
    System.out.println("Number of Books Created is "+ Book.getNumberOfBooks());


  }
}
