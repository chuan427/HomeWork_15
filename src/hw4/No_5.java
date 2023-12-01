package hw4;

import java.util.Scanner;

public class No_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		公元年份非4的倍數，為365天平年。
//		公元年份為4的倍數但非100的倍數，為366天閏年。
//		公元年份為100的倍數但非400的倍數，（1700年、1800年及1900年）為平年。
//		公元年份為400的倍數，（1600年及2000年）為閏年。
		
		System.out.println("請輸入西元_年_月_日(以空白鍵區隔):");
		int year = s.nextInt();
		int month = s.nextInt();
		int date = s.nextInt();
		//定義是否為閏年------------------------------------------------------
		int totalDay;
		if(year % 400 == 0) {
			totalDay = 366;
		}
		else if(year % 100 == 0) {
			totalDay = 365;
		}
		else if(year % 4 ==0) {
			totalDay = 366;
		}
		else {
			totalDay = 365;
		}
		//建立各月天數的陣列---------------------------------------------------
		int[] monthlyDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		switch(totalDay) {
		case 365:
			monthlyDays[1] = 28;
			break;
		case 366:
			monthlyDays[1] = 29;
			break;
		}
		//天數是否正確-------------------------------------------------------
		if(date > monthlyDays[month-1]) {
			System.out.println("您輸入的日期不符合格式，請重新填寫!");
		}
		else {
			int day = 0;
			for(int i = 0;i < month-1;i++) {
				day += monthlyDays[i];
			}
			day += date;
			System.out.println("這一天為西元" + year + "年的第" + day + "天。");
		}
	}

}

