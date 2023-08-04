
public class class04 {

	public static void main(String[] args) {
		
		int [][] arr =new int[8][8];
		
		// arr[0}
		arr[0][0] = 1;
		
		for(int i =0;i<8;i++) {
			arr[0][i] = i+1;
		}
		for(int i =0;i<8;i++) {
			arr[1][i] = i+1;
		}
		for(int i =0;i<8;i++) {
			arr[2][i] = i+1;
		}
		
		for(int i =0; i<8 ;i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = j+1;
			}
		}
		
		for(int i =0; i<8 ;i++){
			for(int j = 0; j<8; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println("=====================================");
		
		for(int i =0; i<8 ;i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = (i*8)+(j+1);
			}
		}
		for(int i =0; i<8 ;i++){
			for(int j = 0; j<8; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		
		System.out.println("=====================================");
		
		for(int i = 0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				arr[i][j] = (i*8)+(j+1);
				if(0<j && j<7) {
					arr[1][j] =0;
					arr[6][j] =0;
				}
				else if(0<i && i<7) {
					arr[i][1] =0;
					arr[i][6] =0;
				}
				else if(2<i && i<5) {
					arr[i][3] =0;
					arr[i][4] =0;	
				}	
			}
		}
		for(int i = 0; i <8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=====================================");
		
		
		
		for(int i  =0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				if((i >= 8/2 && i%2 ==1) || (j >= 8/2 && j%2 ==1)){				
						arr[i][j] = i*8+j+1;
					}
				else if((i < 8/2 && i%2 ==0) || (j < 8/2 && j%2 ==0)){					
						arr[i][j] = i*8+j+1;
				}
				else {
					arr[i][j]= 0;
				}
//				if(i>0 || j> 0 || i< arr.length-1 || j< arr.length-1) {
//					
//				}
			}
			
		}
		
		for(int i = 0; i <8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("=====================================");

		
		// 마름모
		
		for (int i = 0; i<8; i++) {
			for(int j =0; j<8; j++) {
				if(i+j==3 || i+j==11) {
					arr[i][j] = 0;
				}else if(i-j ==4 || j-i ==4) {
					arr[i][j] = 0;
				}
				else {
					arr[i][j] = 8*i+j+1;
				}
			}
		}
		
		for(int i = 0; i <8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		for (int i = 0; i<8; i++) {
			for(int j =0; j<8; j++) {
				arr[i][j] = 8*i+j+1;
				
			}
		}
		
		System.out.println("=====================================");

		// i : 0, j:3,4
		// i : 1, j:2,5
		// i : 2, j:1,6
		// i : 3, j:0,7
		for(int i = 0, j = arr.length/2-1;i<arr.length/2; i++,j--) {
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}
		// i : 4, j:0,7
		// i : 5, j:1,6
		// i : 6, j:2,5
		// i : 7, j:3,4
		for(int i = arr.length/2, j=0; i<arr.length; i++,j++) {
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}
		
		for(int i = 0; i <8; i++) {
			for(int j = 0; j<8; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("=====================================");

		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if((i >= 8/2 && i%2 == 1) || (j >= 8/2 && j%2 == 1)) {
					arr[i][j] = i*8+j+1;
				}
				else if((i < 8/2 && i%2 == 0) || (j < 8/2 && j%2 == 0)) {	
					arr[i][j] = i*8+j+1;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		
		// i : 0, j:3,4
		// i : 1, j:2,5
		// i : 2, j:1,6
		// i : 3, j:0,7
		for(int i = 0, j = arr.length/2;i<arr.length/2; i++,j--) {
			if(i ==0|| j==0|| i==arr.length-1 || j == arr.length-1) {
				continue;
			}
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}
		// i : 4, j:0,7
		// i : 5, j:1,6
		// i : 6, j:2,5
		// i : 7, j:3,4
		for(int i = arr.length/2, j=0; i<arr.length; i++,j++) {
			if(i==0|| j==0|| i==arr.length-1 || j == arr.length-1) {
				continue;
			}
			arr[i][j] = 0;
			arr[i][arr.length-1-j] = 0;
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] < 10) {
					System.out.print(" " + arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		
	}
}

// 한줄짜리 1차원 배열을 여러개 사용
// 반복문 안에 반복문

// String[][] arr =new String[7][8]

