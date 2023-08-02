
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
		
	}

}

// 한줄짜리 1차원 배열을 여러개 사용
// 반복문 안에 반복문

// String[][] arr =new String[7][8]

