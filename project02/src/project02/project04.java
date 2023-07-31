package project02;

import java.util.Scanner;

public class project04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0,0,0,0,0};  //new int[5];
		for(int i =0; i<5;i++) {
			arr[i]=0;
		}
		int max = 0;
		int min = 100;
		

		for(int i = 0; i<5;i++) {
			System.out.print("점수를 입력하세요: ");
			int a1 = scan.nextInt();
			
			if(max<a1) {
				max = a1;
			}
			if(min > a1) {
				min=a1;
			}
			
			if(a1>=90) {
				System.out.println("A");
				arr[0]++;
			}
			else if(a1>=80){
				System.out.println("B");
				arr[1]++;
			}
			else if(a1>=70){
				System.out.println("C");
				arr[2]++;
			}
			else if(a1>=60) {
				System.out.println("D");
				arr[3]++;
			}
			else{
				System.out.println("F");
				arr[4]++;
			}
		}
		
		System.out.println(" A : "+ arr[0] +" B : "+arr[1]+" C : "+arr[2]+ " D : "+arr[3]+" F : "+arr[4]);
		System.out.println("max:  " + max + " min: " + min);
	}
	
}