package k20230411;

import java.util.Arrays;

public class stn {
	
	public static void main(String[] args) {
		
		int[] data = {3,1,5,4,2};
		 /* int max = 0;
			int min = 100;
					
			for (int i = 0 ; i < data.length ; i++) {
				if (data[i] > max) {
					max = data[i];
				} 
				if (data[i] < min) {
					min = data[i];
				}
			}
		 //{1,2,3,4,5}등 등차수열은 최소값이 100으로 유지된다.
		 
		 //최대값과 최소값을 기억할 기억장소에 각각 데이터가 저장된 배열의 0번재 이덱스 요소의 값으로 초기화
		int max = data[0];
		int min = data[0];
		
		 i가 1부터 시작하는 이뉴는 최대값과 최소값을 기억할 변수에 배열의 0번재 인덱스의 
		 값을 초기화로 지정했고 자기 자신끼리 비교해봐야 최솟값을 판별하는 데 전혀 도움이 되지 않는다. 
		for(int i = 1 ; i<data.length ; i++) {
			if (data[i] > max) {
				max = data[i];
			} else if (data[i] < min) {
				min = data[i];
			}
		}
		System.out.printf("최댓값 : %d, 최소값 : %d\n ", max, min);
		
		 //전체 데이터의 합계를 계산한 후 최대값과 최소값은 뺀다.
		int sum = 0;
		for(int i = 0 ; i<data.length ; i++) {
			sum += data[i];
		}
		sum -= max + min ;
		double avg = (double)sum / (data.length -2);
		System.out.printf("합계 : %d, 평균 : %2.3f\n ", sum, avg);
		 */
		 
		 
		 //정렬을 시키자 (버블정렬)
		for(int i = 0 ; i < data.length - 1 ; i++) {
			for(int j = 0; j < data.length - 1 - i; j++) {
				//비교 위치 설정 sysout("i = %d , j = %d\n , i , j );
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
		
		 //최대값과 최소값을 제외한 나머지 데이터의 평균을 계산한다.
		int sum = 0;
		 //정렬을 했기 때문에 굳이 최소값 최대값 찾을 필요 없다.
		 //0번째 인덱스에서는 최소값이 n-1번째 인덱스에는 최대값이 저장
		 //0, n-1번째 인덱스는 제외하고 합계를 계산한다.
		for(int i = 1 ; i<data.length -1; i++) {
			sum += data[i];
		}
		System.out.println(sum);
		double avg = (double)sum / (data.length -2);
		System.out.printf("합계 : %d, 평균 : %f\n ", sum, avg);
		double stn = 0.0;
		for(int i = 1 ; i <data.length -1 ; i++) {
			//최대값과 최소값을 제외한 각 데이터에서 평균을 뺀 편차
			double temp = data[i] - avg;
			//최대값과 최소값을 제외한 각 데이터에서 평균을 뺀 편차의 제곱
			stn += Math.pow(temp, 2);
		}
		System.out.println(stn);
		
		double var = stn / (data.length - 2);
		System.out.printf("최대값과 최소값을 제외한 데이터의 분산 : %f\n ", var);
		double std = Math.pow(var, 0.5); // Math.sqrt(제곱근 계산)
		System.out.printf("표준편차 : %2.3f ", std);
			 /*int sum = 0;
	       for (int i = 1; i < bub.length - 1; i++) {
	           sum += bub[i];
	       }
	       double mean = (double) sum / (bub.length - 2);
	       double variance = 0;
	       for (int i = 1; i < bub.length - 1; i++) {
	           variance += Math.pow(bub[i] - mean, 2);
	       }
	       variance /= (bub.length - 2);
	       double stdDev = Math.sqrt(variance);
	       System.out.printf("표준편차 : %2.3f  " , stdDev); */
	}
}
