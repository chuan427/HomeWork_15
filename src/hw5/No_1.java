package hw5;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入寬與高(以空白鍵區隔):");
		int width = s.nextInt();
		int height = s.nextInt();
		
		starSquare(width,height);

	}
	
	public static void starSquare(int width,int height) {
		for(int i = 0;i < height;i++) {
			for(int j = 0;j <width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
