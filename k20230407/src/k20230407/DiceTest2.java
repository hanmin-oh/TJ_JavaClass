package k20230407;

import java.util.Random;

public class DiceTest2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num1 = 0,  num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
		int[] num = new int[6];
		for (int i = 0 ; i<10 ; i++) {
//			int dice = random.nextInt(6) +1 ;
//			System.out.println(dice);
//			num[dice -1]++;
			num[random.nextInt(6)]++;
		}

		for (int i=0 ; i<num.length ; i++) {
			System.out.println(i + 1 +"의 개수:" + num[i]);
		}
	}
}
