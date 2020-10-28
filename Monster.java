package monsters;

abstract class Monster implements IMonster{
  String monsterName;
  int monsterHp, monsterExp,monsterStrength;
  public Monster(String monsterName,int monsterHp,int monsterExp,int monsterStrength){
    this.monsterName=monsterName;
    this.monsterHp=monsterHp;
    this.monsterExp=monsterExp;
    this.monsterStrength=monsterStrength;
  }

}
