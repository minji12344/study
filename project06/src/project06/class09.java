package project06;

public class class09 {

	public static void main(String[] args) {
//		int[][] arr = new int[3][2];
		int[][] arr = {{10,20},{30,40},{50,60}};
		
		
//		System.out.println(arr);
		
		
		for(int i = 0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
				
		
	}

}
