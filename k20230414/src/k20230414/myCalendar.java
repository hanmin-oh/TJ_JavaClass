package k20230414;

public class myCalendar {
	
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; 
	}
	public static int lastDay(int year, int month) {
		int[] mon = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		mon[1] = isLeapYear(year) ? 29 : 28; 
		
		return mon[month-1]; 
	}
	public static int totalDay(int year, int month, int day) {
		int sumDay = 0;
		sumDay = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for(int i = 1 ; i <month; i++) {
			sumDay += lastDay(year, i);
		}
		sumDay += day;
		return sumDay;
	}
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}

}
