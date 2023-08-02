// 조건문
import java.util.Scanner;
public class class02 {

	public static void main(String[] args) {
		int a = 1;
		if(10 < a) {
			System.out.println("안녕하세요");
		}else if(1 > a) {
			System.out.println("반갑습니다.");
		}else if (a > 6) {
			System.out.println("Hi~");
		}else {
			System.out.println("bye~");
		}
		
		// 입력 Scanner
		// 조건문을 통해서 "?입니다." 1. 가위 2. 바위 3. 보
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if(a == 1) {
			System.out.println("가위");
		}else if (a ==2) {
			System.out.println("바위");
		}else if (a ==3) {
			System.out.println("보");
		}
		else {
			System.out.println("x");
		}
		
		switch(a){
		case 1 :
			System.out.println("가위");
			break;
		case 2 :
			System.out.println("바위");
			break;
		case 3 :
			System.out.println("보");
			break;
		default :
			System.out.println("x");
		}
		
		// 입력 Scanner 둘이서 가위바위보, 누가  이겼는지
		System.out.println("나 ");
		String b = scan.next();
		System.out.println("쟤");
		String c = scan.next();
		
		if (b.equals("가위") && c.equals("가위")) { //b.equals(c)
			System.out.println("무승부");	
		}else if (b.equals("가위") && c.equals("바위")) {
				System.out.println("졌다");		
		}else if (b.equals("가위") && c.equals("보")) {
				System.out.println("이겼다");				
		}
		
		else if (b.equals("바위")) {
			if (c.equals("가위")) {
				System.out.println("이겼다");	
			}
		}else if (b.equals("바위") && c.equals("바위")) {
			System.out.println("무승부");				
		}else if (b.equals("바위")) {
			if (c.equals("보")) {
				System.out.println("졌다");				
			}
		}
		
		else if (b.equals("보")) {
			if (c.equals("가위")) {
				System.out.println("졌다");	
			}
		}else if (b.equals("보")) {
			if (c.equals("바위")) {
				System.out.println("이겼다");	
			}
		}else if (b.equals("보") && c.equals("보")) {
			System.out.println("무승부");				
		}
			
			
		
		int num = 20;
		switch(num){
		case -1 ://if(num == 12)


System.out.println(num);
			break;
		case 2 :
			num *= 10;
			break;
		case (int)10.25 :
			--num; 
			break;
		case 'a' :
			System.out.println(num<2);
			break;
		case 50: 
			System.out.println("안녕하세요");
			break;
		default :
			System.out.println("종착역입니다.");
			
		}

	}
}
