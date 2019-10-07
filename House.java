public class House{
  public int area, numberOfFloors, value, constructionYear;
	public String address;

  public CarModel carModel;

	public House(int area, int numberOfFloors, int value, int constructionYear, String address){
		this.area = area;
		this.numberOfFloors = numberOfFloors;
		this.value = value;
		this.constructionYear = constructionYear;
		this.address = address;
	}

  public void increaseValue(){
		value += value*0.05;
	}

  public String toString(){
    return "Area : "+area+"\n"+"NumberOfFloors : "+numberOfFloors+"\n"+"ValueOfHouse : "+value+"\n"+"constructionYear : "+constructionYear+"\n"+"Address : "+address;
  }


}
