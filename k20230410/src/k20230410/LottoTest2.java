package k20230410;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTest2 {
	
	public static void main(String[] args) {
		Random random = new Random();
		int lotto[] = new int[45];
		for (int i=0 ; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
			//	복권 구매 금액을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("복권 구매가격: " );
		int lottoBuy = scanner.nextInt();
			//	입력한 금액만큼 반복하며 자동 로또 번호를 생성한다.
		for(int i = 0 ; i<lottoBuy/1000 ; i++) {
			for (int j = 0 ; j<45 ; j++) {
				int r = random.nextInt(45);
				int temp = lotto[0];
				lotto[0] = lotto[r];
				lotto[r] = temp;
			}
			int[] lottoNumber = new int[6];
			for (int j=0 ; j<6; j++) {
				lottoNumber[j] = lotto[j];
			}
				//	Arrays.sort(lottoNumber);
			for(int j=0 ; j<=5 ; j++) {
				for (int k = j+1 ; k<6 ; k++) {
					if (lottoNumber[j] > lottoNumber[k]) {
						int temp = lottoNumber[j];
						lottoNumber[j] = lottoNumber[k];
						lottoNumber[k] = temp;
					}
				}
			}
			System.out.printf("%d회차 번호 : " , i+1);
			for (int j = 0 ; j<6 ; j++) {
				System.out.printf("%2d ",lottoNumber[j]);	
			}
				System.out.println();
			if ((i + 1) % 5 == 0) {
				System.out.println("------------------------");
			}
		}
	}
}