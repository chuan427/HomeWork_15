package hw4;

public class No_2 {

	public static void main(String[] args) {
		
		String s = "HelloWorld";
		
		printReverse(s);

	}
	
	public static void printReverse(String s) {
		for(int i = s.length()-1;i >=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
