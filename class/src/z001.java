
public class z001 {

		String name;//인스턴스 변수
		int level;//인스턴스 변수
		int experience;//인스턴스 변수
		
		
		
		z001(String name) {//생성자
			this.name = name;
			this.level = 1;
			this.experience =0;

		}
		
		z001(String name, int level) {//생성자
			this.name = name;
			this.level = level;
		}
		
		void infor() { // 메소드
			System.out.println("캐릭터명 : " + name + ". level : " + level);
		}
		
		void fight() {// 메소드
			System.out.println(name + "이(가) 전투를 시작했습니다.");
		}
		
		void clear(int exp) {// 메소드
			System.out.println("전투를 성공적으로 클리어하였습니다.");
			System.out.println(exp +"의 경험치를 획득하였습니다.");
			getExperience(exp);
		}
		
		void getExperience(int experience) {// 메소드
			this.experience += experience;
			if(this.experience>= 100) {
				System.out.println(name + "의 레벨이 상승합니다." );
				System.out.println("현재 " + name + "의 레벨은 " + (++level) + "입니다.");
				this.experience -= 100;
			}
		}
		
		void avoid() {
			System.out.println("전투에서 도망쳤습니다. 나약한 녀석!!!");
		}

	}
