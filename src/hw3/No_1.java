package hw3;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入三個邊長:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a<(b+c) || b<(a+c) || c<(a+b)) {
			if(a==b && b==c) {
				System.out.println("它是正三角形");
			}
			else if(a == b || b == c || c == a) {
				System.out.println("它是等腰三角形");
			}
			else {
				System.out.println("它是其他三角形");
			}
			
		}
		else {
			System.out.println("它不是三角形");
		}
	}
}
