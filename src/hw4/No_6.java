package hw4;

public class No_6 {

	public static void main(String[] args) {
		
		int[][] exam = new int[6][8];
		exam[0] = new int[] {10,35,40,100,90,85,75,70};
		exam[1] = new int[] {37,75,77,89,64,75,70,95};
		exam[2] = new int[] {100,70,79,90,75,70,79,90};
		exam[3] = new int[] {77,95,70,89,60,75,85,89};
		exam[4] = new int[] {98,70,89,90,75,90,89,90};
		exam[5] = new int[] {90,80,100,75,50,20,99,75};
		
		int[] highest = new int[8];//各個學生拿最高分的次數
		
		//取得各次考試中最高的分數，存入max陣列中---------------------------
		int[] max = new int[6];//六次考試中的最高分數
		
		for(int i = 0;i < exam.length;i++) {
			for(int j = 0;j < exam[i].length;j++) {
				if(exam[i][j] > max[i]) {
					max[i] = exam[i][j];
				}
			}
		}
		//若exam中的值=max各考試中的最高分，則代表這個分數是這次考試中的最高分------
		//則在最高分次數的陣列highest中++
		for(int i = 0;i < exam.length;i++) {
			for(int j = 0;j < exam[i].length;j++) {
				if(exam[i][j] == max[i]) {
					highest[j]++;
				}
			}
		}
		//輸出最高分次數---------------------------------------------
		for(int i = 1;i <= 8;i++) {
			System.out.println(i + "號同學最高分次數:" + highest[i-1]);
		}
		

		
	}

}
