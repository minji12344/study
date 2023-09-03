package project03;

public class pro06 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		
		for(int i = 0; i<7; i++) {
			arr[i]=0;
		}
		
		for(int i=0, j=0 ; i<7; i++) {
			int num = (int)(Math.random()*7)+1;
			int check = 0;
				
			for(int k = 0; k<=j; k++) {
				if(arr[k] == num) {
					i--;
					check = 1;
					break;
					}
				}
			if(check == 1) {
				continue;
			}
			
			
			arr[j++] = num;
			System.out.println(num);
//			System.out.println((int)(Math.random()*45)+1); // 0 ~ 1
		}
		
	}

}

// 랜덤 난수 1~4를 출력할 수 있도록 하여, 카드 게임을 컴퓨터VS 사람으로 수정해보기[함수화 할 수 있으면 해보기]
