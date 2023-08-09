package RPG;

public class Unit {
	private String name;
	private int Level; // 레벨
	private int Health = 100; // 체력
	private int Damage; // 공격력
	private String Attack; // 공격
	
	Unit(){
		
	}
	
	Unit(String name){
		this.name=name;
	}
	
	Unit(String name, int Leverl){
		this.name=name;
		this.Level=Level;
	}
	
	Unit(int Level, int Damage){
		this.Level = Level;
		this.Damage =Damage;
	}
	
	Unit(int Level, int Damage, int Health){
		this.Level = Level;
		this.Damage =Damage;
		this.Health = Health;
	}
	
	Unit(String name, int Level, int Damage, int Health){
		this.name = name;
		this.Level = Level;
		this.Damage =Damage;
		this.Health = Health;
	}
	
	void printattack() {
		System.out.println("----공격----");
	}
	
	int getLevel() {
		return Level;
	}
	
	int getDamage() {
		return Damage;
	}
	int getHealth() {
		return Health;
	}
	
	void setLevel(int Level) {
		this.Level = Level; 
	}
	
	void setDamage(int Damage) {
		this.Damage = Damage; 
	}
	
	void setHealth(int Health) {
		this.Health = Health; 
	}
	
}
