package k20230414;

import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
	
	public static void main(String[] args) {  
		
		//myCalendar calendar = new myCalendar();
		//System.out.println(calendar.isLeapYear(2023));
		//System.out.println(myCalendar.isLeapYear(2023));
		
		//System.out.println(myCalendar.lastDay(2023 , 4));
		//System.out.println(myCalendar.totalDay(2023, 4, 14));
		//System.out.println(myCalendar.weekDay(2023, 4, 13));
		Scanner scanner = new Scanner(System.in);
		Date date = new Date();
		System.out.print("이번달이면 (1) 특정달이면 (2) ");
		int confirm = scanner.nextInt();
		int year = 0 , month = 0 ;
		if (confirm == 1) {
			year = date.getYear() + 1900;
			month = date.getMonth() + 1;
		} else if (confirm == 2) {
			System.out.print("달력을 출력할 년, 월을 입력하세요: ");
			year = scanner.nextInt();
			month = scanner.nextInt();
		}
		
		System.out.printf("==========%4d년%2d월==========\n", year, month);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//1일이 출력될 위치(요일)을 맞추기 위해 요일만큼 반복하며 빈 칸(날짜당 4칸)을 출력한다.
		/*for(int i = 1 ; i<=myCalendar.weekDay(year, month, 1) ; i++) {
			//System.out.print("    ");
		}*/
		
		//1일이 출력될 요일을 맞추기 위해서 전달 날짜를 출력한다.
		int week = myCalendar.weekDay(year, month, 1);
		
		int start = 0;
		if(month == 1 ) {
			start = 31 - week + 1;
		} else {
			start = myCalendar.lastDay(year, month-1) - week + 1;
		}
		
		for(int i = 1 ; i <= myCalendar.weekDay(year, month, 1) ; i++) {
			System.out.print(" " + (start++) + " ");
		}
		for(int i = 1 ; i <= myCalendar.lastDay(year, month) ; i++) {
			System.out.printf(" %2d ", i);
			if(myCalendar.weekDay(year, month, i) == 6 && i != myCalendar.lastDay(year, month)) {
				System.out.println();
			}
		}
		
		/*if(month == 12) {
			week = myCalendar.weekDay(year+1 , 1 , 1);
		} else {
			week = myCalendar.weekDay(year, month+1, 1);
		}
		start = 1;
		for(int i = week; i<=6 ; i++) {
			System.out.printf(" %2d ", start++);
		} */
		
		/*week = myCalendar.weekDay(year, month, myCalendar.lastDay(year, month));
		for(int i = 1 ; i < 7 ; i++) {
			if(week != 6) {
		    	System.out.print("  " + i + " ");
				if(myCalendar.weekDay(year, month + 1, i) == 6 && i != myCalendar.lastDay(year, month + 1)) {
					break;
				}
			}	
		}*/
		week = myCalendar.weekDay(year, month, myCalendar.lastDay(year, month)) +1;
		start = 1;
		for (int i = week; i<=7 ; i++) {
			System.out.printf(" %2d ", start++);
		}
		System.out.println("\n------------------------------");
	}	
}