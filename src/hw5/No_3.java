package hw5;

public class No_3 {

	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));

	}
	
	public static int maxElement(int[][] a) {
		int max = 0;
		
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j <a[i].length;j++) {
				if(a[i][j] > max)
				max = a[i][j];
			}
		}
		return max;
	}
	
	public static double maxElement(double[][] a) {
		double max = 0;
		
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j <a[i].length;j++) {
				if(a[i][j] > max)
				max = a[i][j];
			}
		}
		return max;
	}

}
