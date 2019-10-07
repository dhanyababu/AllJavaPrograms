public class CarModel{
  String modelOfCar;
	int valueOfCar, kmCounter;

	public CarModel(String modelOfCar, int valueOfCar, int kmCounter){
		this.modelOfCar = modelOfCar;
		this.valueOfCar = valueOfCar;
		this.kmCounter = kmCounter;
	}

  public void reduceValue(){
		valueOfCar -=valueOfCar*0.2;
	}

  public String toString(){
    return "ModelOfCar : "+modelOfCar+"\n"+"ValueOfCar : "+valueOfCar+"\n"+"kilometerCounter : "+kmCounter;
  }

}
