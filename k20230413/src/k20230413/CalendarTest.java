package k20230413;

import java.util.Scanner;

public class CalendarTest {
	
	//년도를 인수로 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는 메소드	
	//논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
	}
	//년, 월을 인수로 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
		//각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] mon = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//2월의 마지막 날짜를 확정한다.
		mon[1] = isLeapYear(year) ? 29 : 28; 
		
		//마지막 날짜를 리턴한다.
		return mon[month-1]; 
	}
	//년, 월, 일을 인수로 넘겨받아 1년 1월 1일부터 지난 날자의 합계를 계산해 리턴하는 메소드
	public static int totalDay(int year, int month, int day) {
		int sumDay = 0;
		sumDay = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for(int i = 1 ; i <month; i++) {
			sumDay += lastDay(year, i);
		}
		sumDay += day;
		return sumDay;
	}
	//년 월 일을 인수로 넘겨받아 요일을 숫자로 계산해 리턴하는 메소드
	//일요일이(0) 월요일(1) --- 토요일(6)
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}
	
	public static void main(String[] args) 
	{  //메소드는 닫는 중괄호를 만나거나 return을 만나면 종료 ,,, 리턴에 정수값을 입력하면 void => int로 바꿈
		/*System.out.println(isLeapYear(2020));
		System.out.println(lastDay(2023 , 4));
		//static 메소드는 static 메소드에만 접근할 수 있다.
		System.out.println(totalDay(2023, 4, 13));
		System.out.println(weekDay(2023, 4, 13));
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("달력을 출력할 년, 월을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		
		System.out.printf("==========%4d년%2d월==========\n", year, month);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		//1일이 출력될 위치(요일)을 맞추기 위해 1일의 요일만큼 반복하며 빈 칸 (날짜당 4칸)을 출력한다.
		for(int i = 1 ; i<=weekDay(year, month, 1) ; i++) {
			System.out.print("    ");
		}
		
		//1일 부터 달력을 출력할 달의 마지막 날짜까지 반복하며 달력을 출력한다.
		for(int i = 1 ; i <= lastDay(year, month) ; i++) {
			System.out.printf(" %2d ", i);
			//출력한 날짜가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.
			if(weekDay(year, month, i) == 6 && i != lastDay(year, month)) {
				System.out.println();
			}
		}
		System.out.println("\n------------------------------");
	}	
}