import java.util.Scanner;

public class Arrangement {

	public static void main(String[] args) {
		// 배열
		// 김포공항* - 공항시장 - 마곡나루* - 양천향교 - 가양* - 증미 - 당산* - 국회의사당 - 여의도*
		// 9호선
		
		// 어떤 열차를 탈래? -> 급행인지 급행아닌지
		// 어디역에서 내릴래? -> 위에 있는 역 중에 입력(단, 급행열차는 일반역에 멈추지 않음)
		// 내가 탄 열차가 지나온 역들이 쭉 출력
		
		// 힌트 - 급행역과 일반역이 번갈아가면서 존재한다.
		
		// 출발역
		// 출발역 - 일반역 -> 급행으로 갈아타기
		
		Scanner scan = new Scanner(System.in);
		
		String[] str = {"김포공항", "공항시장", "마곡나루", "양천향교", "가양", "증미", "당산", "국회의사당", "여의도"};
		
		int a = 0;
		int b = 0;
		
		System.out.println("어떤 열차를 탈래? 1.급행 2.일반");
		a = scan.nextInt();
		System.out.println("어디서 내릴래?");
		b = scan.nextInt();
		
		if(a == 1) {
			for(int i = 0; i<=b; i++) {
				if(i%2 == 0) { // 모든 숫자를 2로 나누었을 때, 나머지가 0, 1
					System.out.print(str[i] + " ");
				}
			}		
		}
		
		if(a ==2) {
			for(int i = 0; i<=b; i++) {
				System.out.print(str[i] + "역입니다.");		
				if(b-1 == i) {
					break;
				}
			}
		}
		
		
		
	}

}









