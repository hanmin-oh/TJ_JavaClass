package k20230407;

import java.util.Arrays;
import java.util.Random;

public class CardSuffle {

	public static void main(String[] args) {

//		두 기억장소에 저장된 값 교환하기
//		int a = 3, b = 4;
//		System.out.println("a = " + a + ", b = " + b);
//		
//		int temp = a;
//		a = b;
//		b = temp;
//		System.out.println("a = " + a + ", b = " + b);
		
//		cards 라는 int형 배열을 만들고 0 ~ 51로 초기화한다. 
		int cards[] = new int [52];
		
		for (int i=0 ; i<cards.length; i++) {
			cards[i] = i;
			if((i+1) % 13 == 0) {
			}
		}
		
		System.out.println("######### 섞기 전 #########");
//		System.out.println(Arrays.toString(cards));
		
//		카드 출력에 사용할 숫자와 무늬를 기억하는 배열을 만든다.
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] symbol = {"♠", "◇", "♥", "♧"};
		
//		섞기 전 상태 출력 (1줄에 13개)
		for (int i = 0 ; i<cards.length ; i++) {
//			System.out.printf("%2d ",cards[i]);
//			System.out.printf("%2s ",number[cards[i]%13]);
//			System.out.printf("%s ",symbol[cards[i]/13]);
			System.out.printf("%s%-2s ",symbol[cards[i]/13], number[cards[i]%13]);
//			숫자 13개를 출력하고 줄을 바꾼다.
			if((i+1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("######### 섞은 후 #########");
//		섞는다.
//		cards[0]와 cards[1] ~ cards[51] 사이의 랜덤한 위치를 선택해서 값을 교환한다.
		Random random = new Random();
		for (int i = 0 ; i<52 ; i++) {
			 int r = random.nextInt(51) + 1;
			 int temp = cards[0];
			 cards[0] = cards[r];
			 cards[r] = temp;
		}
		for (int i = 0 ; i<cards.length ; i++) {
			System.out.printf("%s%-2s ",symbol[cards[i]/13], number[cards[i]%13]);
//			숫자 13개를 출력하고 줄을 바꾼다.
			if((i+1) % 13 == 0) {
				System.out.println();
			}
		}
	}
}





