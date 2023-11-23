package hw3;

import java.util.Scanner;

public class No_2 {

public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//2
		int r = (int)(Math.random()*100);
		
		int max = 100;
		int min = 0;
		
		while(true) {
			System.out.print("請輸入您的數字:");
			int g = s.nextInt();
			
			if(g > r) {
				max = g;
				
				System.out.println(min + "~" + max);
			}	
			else if(g < r) {
				min = g;
				
				System.out.println(min + "~" + max);
			}	
			else {
				System.out.println("Bingo!");
				break;
			}	
		}	
			
		
	}

}
