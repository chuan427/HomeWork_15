package hw3;

import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("請輸入您不喜歡的數字(1~9):");
		int hate = s.nextInt();
		
		System.out.println();
		System.out.println("您可以選擇的號碼有以下:");
		
		int sum;
		int total = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				sum= 10*i+j;
				
				if(i!=hate && j!=hate && sum!=0) {
					System.out.print(sum+" ");
					total++;
				}
			}
		}
		System.out.println();
		System.out.println("您可以選擇的總數:");
		System.out.println(total + "個");
		
		
		
	}

}
