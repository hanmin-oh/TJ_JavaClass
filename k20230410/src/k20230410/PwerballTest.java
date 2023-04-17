package k20230410;

import java.util.Random;

public class PwerballTest {
	
	public static void main(String[] args) {
		int powerball[] = new int[69];
				//추첨 규칙 - 1-69 중에서 5개, 1-26 중에서 1개
		show(powerball);
					//		for (int i = 0 ; i<powerball.length ; i++) {
					//			System.out.printf("%2d ",powerball[i]+1);
					//			if((i+1) % 13 == 0) {
					//				System.out.println();
					//			}
					//		}
		Random random = new Random();
		for (int i = 0 ; i<69 ; i++) {
			 int r = random.nextInt(68) +1;
			 int temp = powerball[0];
			 powerball[0] = powerball[r];
			 powerball[r] = temp;
		}
		System.out.println();
		System.out.print("1등 번호 : ");
		for (int i = 0 ; i<5 ; i++) {
			System.out.printf("%2d ",powerball[i]);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("보너스: %2d ", random.nextInt(26) +1);	
	}
	private static void show(int[] powerball) {
		for (int i=0 ; i<powerball.length; i++) {
			powerball[i] = i;
			System.out.printf("%2d ",powerball[i]+1);
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}