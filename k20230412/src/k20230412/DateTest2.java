package k20230412;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTest2 {
 
	public static void main(String[] args) {
		
	//컴퓨터 시스템의 날짜와 시간을 얻어돈다.
		Date date = new Date();
		System.out.println(date);
		//서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		System.out.println(sdf.format(date));
	//생성자의 2번재 인수로 Locale을 지정할 수 있다.
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MMMM.dd(E) a h:mm:ss.SSS", Locale.CHINA);
		System.out.println(sdf2.format(date));
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
	//날짜, 시간 데이터에서 년, 월, 일 , 시, 분, 초 얻어오기
	//Date 클래스는 1900년을 기준으로 날짜를 처리하므로 년도는 얻어와서 1900을 더해야 한다.	
		System.out.println(date.getYear() +1900);
		System.out.println(date.getMonth() +1);
		System.out.println(date.getDate()); //Day = 요일이 숫자로 나온다.
	//밀리초 활용(getTime : 1970년 1월 1일 자정부터 이 메소드가 실행되는 순간까지로 지나온 시간을 밀리초 단위로 얻어온다. 
	// --- 13자리 정수를 얻어온다.
		System.out.println(date.getTime()); 
		System.out.printf("밀리초 : %03d\n",date.getTime() % 1000);
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	// Calendar 클래스 객체를 이용해서 날짜 / 시간을 출력할 서식을 적용하려면 gettime() 메소드를 실행해서
	// 날짜/시간 정보만 얻어온 후 서식을 적용해야 한다. 
		System.out.println(calendar.getTime());
		System.out.println(sdf.format(calendar.getTime()));
		System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(calendar.SECOND));
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		System.out.println(System.currentTimeMillis());
	//currentTimemillis는 13자리 정수이므로 int타입의 면수에 저장시킬 수 없고 long타입의 변수에 저장해서 사용해야 한다. 
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000);
		SimpleDateFormat sdf4 = new SimpleDateFormat("실행시간 : HH:mm:ss.SSS초");
		System.out.println(sdf4.format(end-start-32400000));
	}	
}
