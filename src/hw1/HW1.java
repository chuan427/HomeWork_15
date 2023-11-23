package hw1;

public class HW1 {
	
	public static void main(String[] args) {
	
	System.out.println("第一題:");
	//1
	int a = 12;
	int b = 6;
	
	System.out.println(a + "、" + b + "的和為" + (a + b));
	System.out.println(a + "、" + b + "的積為" + (a * b));
	
	
	
	
	System.out.println();
	System.out.println("第二題:");
	//2
	int total = 200;
	int assign = 12;
	
	for(int i = total,j = 0;true;i -= assign,j++) { //total是未分配的雞蛋，分配後有幾j打
		if(i< assign) {                   //只要小於分配個數就沒辦法再分配，為最終的分配
			System.out.println("有" + j + "打" + i + "顆雞蛋");
			break;
		}
	}
	
	
	
	
	System.out.println();
	System.out.println("第三題:");
	//3
	int totalSecs =256559;
	int secs = totalSecs;
	
	int mins = 0;
	for(int i = secs,j = mins;i > 0;i -= 60,j++) { 
		if(i < 60) {
			mins = j;
			secs = i;
			break;
		}
	}
	int hrs = 0;
	for(int i = mins,j = hrs;i > 0;i -= 60,j++) { 
		if(i < 60) {
			hrs = j;
			mins = i;
			break;
		}	
	}
	int days = 0;
	for(int i = hrs,j = days;i > 0;i -= 24,j++) {
		if(i < 24) {                  
			days = j;
			hrs = i;
			break;
		}	
	}
	System.out.println(totalSecs + "秒為" + days + "天" + hrs + "小時" + mins + "分" + secs+"秒");
	
	
	
	
	System.out.println();
	System.out.println("第四題:");
	//4
	final double PI = 3.1415;
	int r = 5;
	
	System.out.println("半徑為" + r +"的圓面積為" + (r*r*PI));
	System.out.println("半徑為" + r +"的圓周長為" + (2*r*PI));
	
	
	
	
	System.out.println();
	System.out.println("第五題:");
	//5
	double p= 2000000.0;
	double rate = 0.02;
	int n = 10;
	
	for(double i = 0,j = 1;i <= n;i++,j *= (1+rate)) {
		if(i == n) {
			System.out.println(n + "年後本金加利息有" + (p*j));
		}
		
	}
	
	
	
	
	System.out.println();
	System.out.println("第六題:");
	//6
	System.out.println(5+5);//兩個int型態相加，5+5=10
	System.out.println(5+'5');//println方法中'?'等同於取?的unicode碼值，5的unicode碼是53，5+53，因此是58
	System.out.println(5+"5");//print中int型態和String相加，等同於兩個字串相連"5"+"5"
	
	}
}
