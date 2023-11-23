package hw4;

import java.util.Scanner;

public class No_4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("欲借金額:");
		int need = s.nextInt();
		
		int[][] people = new int[5][2];
		people[0] = new int[]{5,2500};
		people[1] = new int[]{32,800};
		people[2] = new int[]{8,500};
		people[3] = new int[]{19,1000};
		people[4] = new int[]{27,1200};
		
		int total = 0;
		for(int i = 0;i < people.length; i++) {
			if(people[i][1] > need) {
				System.out.print(people[i][0] + " ");
				total++;
			}
		}
		
		System.out.print("共" + total + "人");
	}

}
