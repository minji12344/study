package project02;

public class project {

	public static void main(String[] args) {
		for(int i = 0; i<10;i++) {
			System.out.println(i);
		}
		
		int i = 0; //초기식
		while(i<10){
			System.out.println(i++);
			//i++;//증감식
		}
		
//		(0 2 4 6 8 10 ..100)
		for(int j=0; j<=100; j+=2) {
			System.out.println(j);
		}
		
		while(i<=100) {
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
		// 구구단
		
		for(i=0; i<10; i++) {
			System.out.println("2 X " + i + " = " + i*2);
		}
		
		for(int j =2;j<10;j++) {
			System.out.println("---" + j +"단-----");
			for(int k =1;k<10;k++) {
				System.out.println(j + "X" + k + " = " + j*k);
				
			}
		}
		int m = 2;
		while(m<10) {
				System.out.println("---"+ m +"단---");
				int n=1;
			while(n<10) {
				System.out.println(m + "X" + n + " = " + m*n);
				n++;
			}
			m++;
			
		}
		i=2;
		int j=1;
		while(i<10) {
			if(j==1) {
				System.out.println("---"+ m +"단---");
			j++;
			}
			if(j>=10) {
				System.out.println(i + "X" + j + " = " + i*j);
				j=1;
				i++;
			}
		}
	}

}




// 반복문
// for문
// for(1.초기식 ;2. 조건식 ;3. 증감식){
// 코드
//}
// 1. 초기식 -> 처음 시작 정해준다. -> 어디부터 시작할래? 		시작
// 2. 조건식 -> 특정 조건을 만족할 때 반복 -> 언제까지 할래? 		끝
// 3. 증감식 -> 시작부터 끝까지 도달하는 방식 -> 어떻게 진행할래?  중간

// while문
// while(조건식{
// 코드
//}
// 언제까지 할래? -> 끝 


// for(1.초기식, 초기식, 초기식, 초기식; 2.; 3.증감식, 증감식, 증감식;)
// for(int i=0, j=0, k=0; i<10 && j<20 || k<100; i++, j+=2, k*=2)
// for(; 2. 조건식;)

