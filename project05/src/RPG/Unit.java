package RPG;

public class Unit {
	private String name;
	private int Level;
	private int Attack;
	private int Health;
	
	Unit(){
		
	}
	
	Unit(String name){
		this.name=name;
	}
	
	Unit(String name, int Leverl){
		this.name=name;
		this.Level=Level;
	}
	
	Unit(int Level, int Attack){
		this.Level = Level;
		this.Attack =Attack;
	}
	
	Unit(int Level, int Attack, int Health){
		this.Level = Level;
		this.Attack =Attack;
		this.Health = Health;
	}
	
	Unit(String name, int Level, int Attack, int Health){
		this.name = name;
		this.Level = Level;
		this.Attack =Attack;
		this.Health = Health;
	}
	
	void printattack() {
		System.out.println("공격");
	}
	
	int getLevel() {
		return Level;
	}
	
	int getAttack() {
		return Attack;
	}
	int getHealth() {
		return Health;
	}
	
	void setLevel(int Level) {
		this.Level = Level; 
	}
	
	void setAttack(int Attack) {
		this.Attack = Attack; 
	}
	
	void setHealth(int Health) {
		this.Health = Health; 
	}
	
}
