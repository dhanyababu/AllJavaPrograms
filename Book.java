public class Book {
  private String title,author;
  static int numberOfBooks;

  // public Book(){
  //   numberOfBooks++;
  //
  // }


  public Book(String title,String author){
    this.title=title;
    this.author=author;
     numberOfBooks++;

  }


  public Book(String title){
    this(title,"No Author");
    // numberOfBooks++;
  }

  public void setTitle(String newTitle){
    title=newTitle;
  }

  public void setAuthor(String newAuthor){
    author=newAuthor;
  }

  public void setBook(String newTitle,String newAuthor){
    title=newTitle;
    author=newAuthor;
  }

  public String getTitle(){
    return title;
  }

  public String getAuthor(){
    return author;
  }

  public String toString(){
    return  author  +"-"+  title;
  }

  public static int getNumberOfBooks() {
    return numberOfBooks;
  }

}
