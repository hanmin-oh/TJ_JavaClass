package k20230410;

import java.util.Arrays;

public class RankingTest2 {
	
	public static void main(String[] args) {
		
		int[] score = {88, 100, 74, 95, 94};
		int[] rank = new int[score.length];
		for (int i=0 ; i<rank.length ; i++) {
			rank[i] = 1;
		}
		for(int i=0 ; i<score.length ; i++) {
			for(int j = i+1 ; j<score.length ; j++) { // 개념 이해 필수
				if(score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) { 
					rank[i]++;
				}
			}
		}	
		for(int i = 0 ; i<score.length; i++) {
			System.out.printf("%3d점은 %d등 입니다", score[i] , rank[i]);
			//별점출력 (10점당 별 한개)
			for(int j =0 ; j<score[i] / 10 ; j++) {
				System.out.printf("★");
			}
			if(score[i] % 10 >= 5 ) {
				System.out.print("☆");
			}
			System.out.println();
 		}
	}
}