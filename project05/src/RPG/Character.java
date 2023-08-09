package RPG;

public class Character extends Unit{
	private String Character_name;
	
	Character(String Character_name){
		this.Character_name = Character_name;
	}
	
	Character(int Level, int Damage, int Healyh){
		super(Level, Damage,Healyh);
	}
	
	Character(String name, int Level, int Damage, int Healyh){
		super(name ,Level, Damage,Healyh);
	}
	@Override
	void printattack() {
		System.out.println("공격22222");
	}
	
	void printname() {
		System.out.println("캐릭터 닉네임 : " + Character_name);
	}
	
	void clear(int exp) {
		System.out.println(exp + "의 경험치 획득");
		setLevel(exp);
	}
	
	void printLevel() {
		super.setLevel(super.getLevel()+1);
		if(super.getLevel()>= 100) {
			System.out.println(this.Character_name + "의 레벨이 상승합니다." );
			System.out.println("현재"  + this.Character_name + "의 레벨은 " + (super.getLevel()) + "입니다.");
			super.setLevel(super.getLevel() -100);
		}
	}
	
	String getName() {
		return Character_name;
	}
	
	void setgetName(String Character_name) {
		this.Character_name = Character_name;
	}
	
}
