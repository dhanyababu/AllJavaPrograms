public class Person2 {
	private String firstName, lastName;
	private int age;
  static int countOfObject=0;

  // public Person2(){
    // countOfObject+=1;
  // }
  public static int getCountOfObject(){
    return countOfObject;
  }

  public Person2(String firstName, String lastName, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
    countOfObject++;
	}
	 public void setAge(int newAge){
	    if(newAge>= 0 && newAge <= 100)
		    age = newAge;
		  else
		    age = 20;
	 }
	 public int getAge(){
		   return age;
	 }
	 public void setFirstName(String newFirstName){
		       firstName = newFirstName;
	 }

	 public String getFirstName(){
		   return firstName;
	 }

	 public void setLastName(String newLastName){
		   lastName = newLastName;
	 }
	 public String getLastName(){
		   return lastName;
	 }

   public void setName(String newFirstName,String newLastName){
      firstName = newFirstName;
      lastName = newLastName;
   }
   public void setName(String newFirstName){
     firstName = newFirstName;
   }

}
