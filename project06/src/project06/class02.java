package project06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class class02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("숫자 입력 : ");
			int n1 = scan.nextInt();
			
			System.out.print("숫자 입력 : ");
			int n2 = scan.nextInt();
			int result = n1/n2;
			System.out.println("결과 : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력해주세요.");
		}
	}

}
