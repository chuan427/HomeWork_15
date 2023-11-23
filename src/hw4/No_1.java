package hw4;

public class No_1 {

	public static void main(String[] args) {
		
		int[] a = {29,100,39,41,50,8,66,77,95,15};
		
		int sum = sum(a);
		
		double avg = avg(a);
		
		System.out.println(avg);
		
		printArray(a);
	}
	
	public static int sum(int[] a) { //求陣列中的和的方法
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double avg(int[] a) { //求陣列的平均值的方法
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			sum += a[i];
		}
		double avg = (double)sum/a.length;
		return avg;
	}
	
	public static void printArray(int[] a) { //印出陣列中大於平均值的數字的方法
		int sum = 0;
		for(int i = 0;i < a.length;i++) {
			sum += a[i];
		}
		double avg = (double)sum/a.length;
		for(int i = 0;i < a.length;i++) {
			if(a[i] > avg) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
