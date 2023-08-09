package RPG;

public class Main {

	public static void main(String[] args) {
		// RPG 게임
		// 유닛 - (캐릭터, 몬스터) - (직업)
		// 유닛 - 공격, 레벨업, 체력
		// 몬스터 - 타입
		//캐릭터 = 경험치
		// 직업 - 직업이름

		Unit unit = new Unit();
		
		Character character = new Character("민지");
		Character_Job cj = new Character_Job(character, "job");
		Monster mon = new Monster("물", "물고기");
		
//		character.printname();
		cj.printjob();
		mon.printInfo();
		mon.printattack();
		cj.clear((int)(Math.random()*90)+10);
		
		
		
	}

}
