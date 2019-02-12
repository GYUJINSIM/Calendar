package calendar;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int MaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		Calendar cal = new Calendar();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력하고싶은 달을 입력하시오(-1을 입력하면 종료)");			

		int month = 1;
		while(true){	
			System.out.print(">");			
			month = scan.nextInt();
			if(month==-1)
				break;
			if(month==0||month>12)
				continue;
			System.out.println(month + "월은" + cal.MaxDaysOfMonth(month) + "일까지입니다.");			 
		}
		System.out.println("Fin");
		scan.close();
		
	}
		
}
