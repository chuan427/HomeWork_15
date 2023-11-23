package hw2;

public class HW2 {

	public static void main(String[] args) {
		
		//1
		int sum = 0;
		for(int i= 0;i<=1000;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println("總合:"+sum);
		
		//2
		int product = 1;
		for(int i=1;i<=10;i++) {
			product *= i;
		}
		System.out.println("乘積:" + product);
		
		//3
		int n = 1;
		int product2 = 1;
		while(n<=10) {
			product2 *= n;
			n++;
		}
		System.out.println("乘積:" + product2);
		
		//4
		for(int i = 1;i<=10;i++) {
			System.out.print((i*i)+" ");
		}
		System.out.println("");
		
		//5
		int sum3;
		int total = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				sum3= 10*i+j;
				
				if(i!=4 && j!=4 && sum3!=0) {
					System.out.print(sum3+" ");
					total++;
				}
				
			}
			
		}
		System.out.println();
		System.out.print(total);
		
		
		System.out.println();//下一題
		//6
		for(int i=1,j=10;i<=10;i++,j--) {
			for(int k=1;k<=j;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		System.out.println();//下一題
		//7
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				switch(i) {
				case 1:
					System.out.print("A");
					continue;
				case 2:
					System.out.print("B");
					continue;
				case 3:
					System.out.print("C");
					continue;
				case 4:
					System.out.print("D");
					continue;
				case 5:
					System.out.print("E");
					continue;
				case 6:
					System.out.print("F");
					continue;
				}
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
