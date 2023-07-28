package project;

import javax.sound.midi.SysexMessage;

public class project2 {

	public static void main(String[] args) {
		// 산술연산자
		System.out.println(5+2);
		System.out.println(5-2);
		System.out.println(5*2);
		System.out.println(5.0/2);
		System.out.println(5%2);

		System.out.println("-------------------");
		// 비교연산자
		System.out.println(5<6); //ture
		System.out.println(5>6); //False
		System.out.println(5<=6); //ture
		System.out.println(6>=6); //ture
		System.out.println(5==5); //ture
		System.out.println(6!=5); //ture

		System.out.println(!(5==5)); //false
		
		System.out.println("-------------------");
		
		int a = 1;
		int b = 2;
		
		// 부정연산자
		System.out.println(a>b);
		System.out.println(a*b);
		System.out.println(!(a==b));
		
		// 논리연산자
		// b가 1보다 크고 10보다 작은가?
//		System.out.println(1<b<10);
		System.out.println(1<b && b<10);
		
		// a,b 둘 중 하나라도 음수인가?
		System.out.println(a<0 || b<0);
		
		// 식별자
		int abc123 = 1;
		int abc_123 = 123;
		
		// 증감연산자
		int num_123 = 123;
		
		num_123 = num_123 +100;
		num_123 += 100;
		System.out.println(num_123);// 323

		System.out.println(num_123++); // 323
		System.out.println(++num_123); // 325
		System.out.println(num_123); // 325
		System.out.println(--num_123); // 324
		System.out.println(num_123--); // 324
	
		
		int m = 1;
		System.out.println(++m); //2 해당 라인부터 더하기
		System.out.println(m++); //2 다음라인부터 적용
		System.out.println(--m); //3 -> 2
		System.out.println(m--); // 2
		System.out.println(--m); // 0
		



	}

}


// 연산자
// 산술연산자 - +, -, *, /, %
// 비교연산자 - <, >, <=, >=, ==(같다), !=(다르다)
// 부정연산자 -!
// 논리연산자 - &&(and), ||(or)
// 대입연산자 - a = b -> 우항의 '값'을 좌항에 대입한다.
// 자료형 변수명 = 값
// 식별자 - 숫자가 제일 앞에 올 수 없다. 특수문자 - 언더바(_)사용 가능
// int, double, out, System, print ... 변수로 사용 못함.
// 변수 - 전부 소문자, 클래스, 함수 - 첫 글자만 대문자
// snake = helloWorld, camel - Print, Print_Out
// 증감연산자 - 값을 증가시키고, 감소시키고
// +=, -=, *=, /=, %=
// ++, --
// 전위증가 전위감소 -> ++num, --num -> 코드를 실행하기 전
// 후위증가 후위감소 -> num++, num-- -> 코드를 실행한 후





