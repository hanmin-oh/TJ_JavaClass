package k20230407;

import java.util.Random;

public class LottoTest {
	
	public static void main(String[] args) {
		//추첨기를 만든다
		int lotto[] = new int[45];
		
		//추첨기에 공을 넣는다
		for (int i=0 ; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
					//		System.out.printf("%2d ",lotto[i]+1);
					//		if((i+1) % 6 == 0) {
					//		System.out.println();
					//		}
					//		for (int i = 0 ; i<lotto.length ; i++) {
					//			System.out.printf("%2d ",lotto[i]+1);
					//			if((i+1) % 13 == 0) {
					//				System.out.println();
					//			}
					//		}
		//섞는다
		Random random = new Random();
		for (int i = 0 ; i<45 ; i++) {
			 int r = random.nextInt(45);
			 int temp = lotto[0];
			 lotto[0] = lotto[r];
			 lotto[r] = temp;
		}
		//1등 번호를 출력한다
		System.out.print("1등 번호 : ");
		for (int i = 0 ; i<7 ; i++) {
			System.out.printf("%2d ",lotto[i]);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf(" --- 보너스: %2d ", lotto[6]);		
	}
}