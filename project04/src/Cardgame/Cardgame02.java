package Cardgame;

import java.util.Scanner;

public class Cardgame02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			num[i]=i+1;
			System.out.print(num[i] +" ");
			
			int inputNumber = scan.nextInt();
			
			if (i != inputNumber) {
				System.out.print(num[i] + " ");
		}

	}

}
}
