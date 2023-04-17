package k20230410;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionsSrotTest {

	public static void main(String[] args) {
		
		int[] data = {8, 3, 47, 9, 1, 56};
		for(int i = 0 ; i<=data.length - 1 ; i++) {
			for (int j = i+1 ; j<data.length ; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}	
}
