package project02;

public class project06 {

	public static void main(String[] args) {
		int [][] student= new int[6][4];	
//		System.out.println(student[0][3]);
		
		for(int i=0;i<6;i++) {
			//student[i][i] = 20; //0 0 1 1 2 2
			for(int j=0;j<4;j++) {
				student[i][j] = 20;				
			}
		}
		for(int i=0;i<6;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(student[i][j] +" ");			
			}
			System.out.println();
		}

		//10X10 배열 1~100 다 넣어주고 사각형으로 출력
		
		int[][] a =new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				a[i][j]=(i+1)*(j+1);
//				System.out.print(k);
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				a[i][j]= 10*i+j+1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		// 1~25까지
		int[][] b =new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				b[i][j]=5*i+j+1;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(b[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
	}

}


// 1차원 배열



// 다차원 배열
// 자료형[][] 배열명 = new 자료형[크기][크기];

//별만들기 -> 반복문
//숫자모양 ->배열
//왕거지게임
//{"노예"<"시민"<"귀족"<"왕"}


//*
//**
//***
//****
//*****
//
//    *
//   **
//  ***
// ****
//*****
//
//*****
//****
//***
//**
//*
//
//*****
// ****
//  ***
//   **
//    *
//    
//    "*" " ""\n"

//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
//
//1 6 11 16 21
//2 7 12 17 22
//3 8 13 18 23
//4 9 14 19 24
//5 10 15 20 25
//
//5 4 3 2 1
//6 7 8 9 10
//15 14 13 12 11
//16 17 18 19 20
//25 24 23 22 21
//
//1 10 11 20 21
//2 9 12 19 22
//3 8 13 18 23
//4 7 14 17 24
//5 6 15 16 25