import java.util.Scanner;

public class Rock_paper_scissors {

	public static void main(String[] args) {
		
// 반복문 -> 두명에서 5번 게임 했을 때, 누가 이겼는지 혹은 1번째 사람이 (몇승 몇무 몇패)
		Scanner scan = new Scanner(System.in);
		
		
		int c = 0;
		int d = 0;
		int e = 0;
		
		for(int i =0; i<5; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			while(a !=1 && a!=2 && a!=3) {
				System.out.println("잘못입력");
				a = scan.nextInt();
			}
			
			if(a == b) {//a.equals(b)
				System.out.println("무승부");
				e++;
			} else if(a==1 && b == 2) {
				System.out.println("패배");
				d++;
			} else if(a == 1 && b == 3) {
				System.out.println("승리");
				c++;
			}
			else if(a == 2) {
				if(b==1) {
					System.out.println("승리");
					c++;
				} else if(b==3) {
					System.out.println("패배");
					d++;
				}
			}
	
			else if(a == 3) {
				if(b==1) {
						System.out.println("패배");
						d++;
				} else if(b==2) {
					System.out.println("승리");
					c++;
				} 
			}
		}
		//전에 코드를 반복문 감싸고, 변수 3개 만들어서 최종적으로 출력한다.
		System.out.println("승리 : "+ c + ", 패배 : "+ d + ", 무승부 : " + e);
		//switch 활용
		int a = 0;
		int b = 0;
				if(a == b) {//a.equals(b)
					System.out.println("무승부");
				} else {
					switch(a) {
					case 1:
						if(b==2) {
							System.out.println("패배");
						} else if(b==3) {
							System.out.println("승리");
						}
						break;
					case 2:
						switch(b) {
						case 1:
							System.out.println("승리");
						case 3:
							System.out.println("패배");
						}
						break;
					case 3:
						if(b==1) {
							System.out.println("패배");
						} else if(b==2) {
							System.out.println("승리");
						} 
						break;
					}
				}
	}

}
