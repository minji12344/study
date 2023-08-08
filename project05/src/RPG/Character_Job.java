package RPG;

public class Character_Job extends Character{
	
	private String job;
	private String skill;
	
	Character_Job(Character character, String job, String skill) {
		super(character.getName(), character.getLevel(), character.getAttack(), character.getHealth());
		this.job = job;
		this.skill = skill;
	}
	Character_Job(String name, int Level, int Attack, int Healyh, String job, String skill){
		super(name, Level, Attack, Healyh);
		this.job = job;
		this.skill = skill;
	}
	
	void printjob() {
		System.out.println("직업 : " + this.job + "스킬 : " + this.skill );
	}
	
	@Override
	void printattack() {
		System.out.println("스킬사용!!!!!" + skill);
	}
	
	
	
}
