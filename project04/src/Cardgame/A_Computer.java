package Cardgame;
public class A_Computer extends A_Card{
	int cardNumber;	
	int count = 0;
	String name;
	
	A_Computer(String name) {
		this.name = name;
	}
	
	int inputComputer() {
		cardNumber = rand();		
		super.arr[count++] = cardNumber;
		System.out.println("컴퓨터 : " + cardNumber);
		
		return cardNumber;
	}

	int rand() {
		int computer = (int)(Math.random()*4+1);
		
		for(int k = 0; k < arr.length; k++) {
			if(arr[k] == computer) {
				computer = (int)(Math.random()*4+1);
				k = -1;// k = 0; 문제의 원인 -> k++ 1번째 검사를 한다.
				continue;
			}
			else if(arr[k] == 0) {
				break;
			}
		}
		return computer;
	}
}
