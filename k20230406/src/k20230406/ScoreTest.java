package k20230406;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		
//		int kor = 91, eng = 93, math = 96;
//		System.out.printf("%d" , (kor + eng + math) /3 );	
//		int kor = scanner.nextInt();
//		int math = scanner.nextInt();
//		int eng = scanner.nextInt();
//		System.out.println(" 3개 점수의 평균: " + (kor + math + eng) / 3);

//		System.out.print("국어 점수");
//		int kor = scanner.nextInt();
//		System.out.print("수학 점수");
//		int eng = scanner.nextInt();
//		System.out.print("영어 점수");
//		int math = scanner.nextInt();
//		
		System.out.print("3과목 점수를 입력하세요: ");
		int kor = scanner.nextInt();
		int math = scanner.nextInt();
		int eng = scanner.nextInt();

		int total = kor + math + eng;
		double average = (double) total / 3;
		System.out.println("총점: " + total + "점, 평균 : " + average);
		System.out.printf("총점: %d점, 평균: %2.2f\n", total, average);
		
//		if(average < 90 && average >=80) {
//		System.out.println("B");
//		}
//		if(average < 80 && average >=70) {
//		System.out.println("C");
//		}
//		if(average < 70 && average >=60) {
//		System.out.println("D");
//		}
//		if(average < 60 ) {
//		System.out.println("F");
//		}
		
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 80) {
			System.out.println("B");
		} else if (average >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

	}
}
