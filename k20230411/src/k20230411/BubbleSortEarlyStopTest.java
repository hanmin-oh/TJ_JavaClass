package k20230411;

import java.util.Arrays;

public class BubbleSortEarlyStopTest {
	
	public static void main(String[] args) {
		
		int[] bub = {9, 1, 3, 4, 8};
		
		for(int i = 0 ; i < bub.length - 1 ; i++) {
			int flag = 0;
			for(int j = 0; j < bub.length - 1 -i; j++) {
				if(bub[j] > bub[j+1]) {
					int temp = bub[j];
					bub[j] = bub[j+1];
					bub[j+1] = temp;
					
					//값 교환이 이루어지면 flag라는 변수에 1을 저장한다.
					flag = 1;
				}
			}
			if (flag == 0) { //flag값이 0으로 유지가 되면 반복할 필요가 없기 대문에 break를 넣어 탈출
				break;
			}
			System.out.println(i + 1 + "회전결과: " + Arrays.toString(bub));
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("버블정렬 결과 : %s\n" , Arrays.toString(bub));
		
	}
}