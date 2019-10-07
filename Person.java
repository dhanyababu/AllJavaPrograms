public class Person {
  public String name, profession, gender;
	public int height, age;

  public House home;

  public Person(String name, String profession, String gender, int height, int age){
		this.name = name;
		this.profession = profession;
		this.gender = gender;
		this.height = height;
		this.age = age;
	}

  public void increaseAge(){
		age += 1;
	}

  public String toString(){
    return "Name : "+name+"\n"+"profession : "+profession+"\n"+"gender   : "+gender+"\n"+"height : "+height+"\n"+"age : "+age;
  }

}
