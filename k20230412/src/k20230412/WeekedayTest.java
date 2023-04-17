package k20230412;

import java.util.Scanner;

public class WeekedayTest {
	
	public static void main(String[] args) {
		//요일을 계산할 년, 월, 일을 입력받는다
		Scanner scanner = new Scanner(System.in);
		System.out.println("년, 월, 일을 차례로 입력하세요");
		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		
	//서기 1년 1월부터 요일을 계산하기 위해 입력한 날짜까지 날짜수를 게산한다.
			 /* int s = (y -1) * 365 ;
			 for(int i = 1 ; i<= y-1 ; i++) {
				if(i % 4 == 0 && i % 100 !=0 || i % 400 == 0) {
					s++;
				}
			 }*/
		     // int y1 = 1 , m1 = 1 ,  d1 =1;
		 
		int s = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
			 /*for (int i=1 ; i<m ; i++) {
				switch(i) {
					case 2:
						s += y % 4 == 0 && y % 100 !=0 || y % 400 == 0 ? 29 : 28; break;
					case 4: case 6: case 9: case 11:
						s += 30; break;
					default :
						s += 31;
				}
			 }*/
		//전년도 12월 31일까지 지난 날짜수에 전달까지 지난 날짜를 더한다.
		int[] mon = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		mon[1] = y % 4 == 0 && y % 100 !=0 || y % 400 == 0 ? 29 : 28;
		for (int i=1 ; i<m ; i++) {
			s += mon[i-1];
		}
		//전달까지 지난 날짜에 일을 더한다.
		s += d;
		int n = s % 7;
			 /*int k;
			 if (m<8) {
				if(m % 2 == 0) {
					k= s + (m-1) * 30 + d;
				} else {
					k= s + (m-1) * 31 + d;
				}
			 } else {
				if(m % 2 != 0) {
					k= s + (m-1) * 30 + d;
				} else {
					k= s + (m-1) * 31 + d;
				}
			 }*/
		String[] w = {"일" , "월" , "화" , "수" , "목" , "금" , "토"};
		String week = w[n];
		System.out.printf("%d년 %d월 %d일은 %s요일입니다." , y, m, d, week);
	}
}
