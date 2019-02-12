package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int MaxDaysOfMonth(int month){
		return MAX_DAYS[month-1];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출력하고싶은 달을 입력하시오:");
		int month = scan.nextInt();
		
		Calendar cal = new Calendar();
		System.out.print(month+"월은"+cal.MaxDaysOfMonth(month)+"일까지 있습니다.");
		
		scan.close();
	}

}
