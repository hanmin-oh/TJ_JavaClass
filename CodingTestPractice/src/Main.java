import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		Calendar cla = Calendar.getInstance();
		System.out.println(cla);
		
		cla.get(Calendar.DATE);
		System.out.println(cla.get(Calendar.DATE));
		
	}
}
