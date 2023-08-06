package Cardgame;

import java.util.Random;

public class person {
//	private static final int MAX_FACES = 6;
	public static void main(String[] args) {
    	
		int randomNumber = 0 ;
    	for(int i = 0;i<10; i++) {
    		randomNumber = (int)(Math.random()*20)+1;
		}
    	for(int i = 0;i<10; i++) {
		System.out.print(randomNumber +" ");

    	}
        
    
	}
    }


