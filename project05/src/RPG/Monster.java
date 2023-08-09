package RPG;

public class Monster extends Unit{
	private String type;
	private String monster_name;
	
	
	
	Monster(String type, String monster_name){
		this.type = type;
		this.monster_name = monster_name;
	}
	void printInfo() {
		System.out.println("'" + this.type + "' 속성을 가진 " + this.monster_name); // + " 가 " + this.Attack + " 한다");
	}
	@Override
	void printattack() {
		super.printattack();
		System.out.println("'"+ this.monster_name + "'가 공격합니다.");
		
		if (super.getHealth() < 0) {
			super.setHealth(super.getHealth()-(int)(Math.random()*90)+10);
			System.out.println(this.monster_name + " 체력 : " + super.getHealth());			
		}else {
			System.out.println(this.monster_name +  " 죽었다");
		}
	}
	
	void printAtt() {
		
	}
}
