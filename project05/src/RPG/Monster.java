package RPG;

public class Monster extends Unit{
	private String type;
	private String monster_name;
	private int Attack;
	
	Monster(String type, String monster_name, int Attack){
		this.type = type;
		this.monster_name = monster_name;
		this.Attack = Attack;
	}
	
	void printInformation () {
		System.out.println("'" + this.type + "' 속성을 가진 " + this.monster_name); // + " 가 " + this.Attack + " 한다");
	}
	@Override
	void printattack() {
		super.printattack();
		System.out.println(this.monster_name + " 가 " + this.Attack + " 한다");
	}
	
}
