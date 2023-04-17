package k20230410;

import java.util.Arrays;

public class RankingTest3 {
	
	public static void main(String[] args) {
		
		int[] score = {88, 100, 74, 95, 94};
		int[] rank = new int[score.length];
	      for (int i=0; i<score.length; i++) {
	          System.out.printf("%3d점은 %d등 입니다. ", score[i], rank[i]);
	          int count = 10 - (score[i] / 10 + (score[i] % 10 >= 5 ? 1 : 0));
	          for (int j=0; j<count; j++) {
	             System.out.print(" ");
	          }
//	          별점 출력
	          if (score[i] % 10 >= 5) {
	             System.out.print("☆");
	             count++;
	          }
	          for (int j=0; j<score[i] / 10; j++) {
	             System.out.print("★");
	             count++;
	             if (count % 5 == 0) {
	                System.out.print(" ");
	             }
	          }
	          System.out.println();
	       }
		
	}
}