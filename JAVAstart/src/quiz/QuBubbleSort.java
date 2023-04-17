package quiz;

import java.util.Random;

public class QuBubbleSort
{
	public static void main(String[] args)
	{
		QuBubbleSort qbs = new QuBubbleSort();

		/*
         * 중복되지 않는 난수 10개(1~99)를 생성하여 크기가 10인 배열에 담는다.
         * 오름차순으로 버블정렬한다.(1, 2, 3 …… 10)
         * 버블정렬이란 모든 배열요소를 순차적으로 비교하여 스왑(교환)하는 
         * 알고리즘이다. 단, 정렬되는 과정을 모두 출력해야 한다.
         */
		int[] numArr = new int[10];
		
		// 난수 생성시 컴퓨터 밀리시간으로 씨드 만들기 #2
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		// 배열에 수 넣기
		System.out.println("##### 배열 만들기 #####");
		qbs.makeRandomNumberArray(numArr, random, 99);
		
		// 중복확인 전 배열 출력
		System.out.println("##### 중복 체크 전 출력#####");
		qbs.printArray(numArr);
		qbs.dupCheck(numArr, random, 99);
		
		// 중복확인후 배열 출력
		System.out.println("##### 중복 체크 후 출력#####");
		qbs.printArray(numArr);
		
		System.out.println("##### 버블 정렬 전 출력");
		qbs.printArray(numArr);
		// 버블 정렬 시작
		qbs.bublleSortAsc(numArr);
		System.out.println("##### 버블 정렬 후 출력");
		qbs.printArray(numArr);
	}
	
	// 버블 정렬을 위한 메서드
	void bublleSortAsc(int[] array) 
	{
		/*
		 크기가 10인 배열이므로 스켄은 9번만 반복하면 된다.
		 즉 i의 증가치는 0~8번까지 변하게 된다.
		 */
		for(int i = 1; i<=array.length; i++)
		{
			for(int j=0; j<array.length-i; j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				printArray(array);
			}
			// 정렬과정 출력해보기
			printArray(array);
			System.out.println("++++++++++++++++++++");
		}
	}
	// 중복 검사를 위한 메서드
	void dupCheck(int[] array, Random random, int maxNum)
	{
		for(int i=0 ;  i<array.length-1; i++)
		{
			for(int j= i+1; j<array.length; j++)
			{
				if(array[i] == array[j])
				{
					array[j] = ((random.nextInt(maxNum))+1);
				}
			}
		}
	}
	
	// 배열을 출력하는 메서드
	void printArray(int[] array)
	{
		for(int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	void makeRandomNumberArray(int[] arr, Random random, int maxNum)
	{
		for(int i =0 ; i <arr.length; i++)
		{
			arr[i] = ((random.nextInt(maxNum))+1);
		}
	}
}
