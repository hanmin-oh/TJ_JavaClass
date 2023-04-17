package k20230410;

import java.util.Arrays;
import java.util.Random;

public class QuBubbleSort {
	
	public static void main(String[] args) {
		
		int[] bub = new int [99];
		for(int i = 0 ; i<bub.length ; i++) {
			bub[i] = i+1; 
		}
		Random random = new Random();
		for(int i = 0 ; i<99 ; i++) {
			int r = random.nextInt(99);
			int temp = bub[0];
			bub[0] = bub[r];
			bub[r] = temp;
		}// 
		int[] bul = new int [10];
		for(int i = 0 ; i<10 ; i++) {
			bul[i] = bub[i];
		}
		System.out.println(Arrays.toString(bul));
		
		for(int i = 0 ; i < bul.length-1 ; i++) {
			for(int j=0; j<bul.length-1 - i; j++) {
				if(bul[j] > bul[j+1]) {
					int temp = bul[j];
					bul[j] = bul[j+1];
					bul[j+1] = temp;
				}
			}
			System.out.println(i + 1 + "회전결과: " + Arrays.toString(bul));
		}
		System.out.println(Arrays.toString(bul));
	}
}
