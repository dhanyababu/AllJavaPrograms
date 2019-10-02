public class House{
  String address;
  int levels;
  int postCode;
  boolean isCool;
  char addressCharacter;
  public void changeAdress(String newAdress){
    address=newAdress;
  }
  public String showAddress(){
    return address;
  }
}
