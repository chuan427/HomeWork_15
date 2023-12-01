package hw5;

public class No_2 {

	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		for(int i = 0;i < randomArray.length;i++) {
			randomArray[i] = (int)(Math.random()*100);
		}
		
		randAvg(randomArray);
	}
	
	public static void randAvg(int[] a) {
		System.out.println("本次亂數結果:");
		int total = 0;
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i] +" ");
			total += a[i];
		}
		
		int avg;
		avg = total/a.length;
		
		System.out.println();
		System.out.println(avg);
	}

}
