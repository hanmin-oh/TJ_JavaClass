package k20230417;

public class MagicSquareTest {
	
	public static void main(String[] args) {
		
		int[][] a = new int [5][5] ;
		int i = 0, j = 2;
		for(int k = 1 ; k <=25 ; k++) {
			a[i][j] = k;
			if(k % 5 == 0) {
				i++;
			}else {
				if(--i < 0) {
					i = 4;
				}
				if(++j == 5) {
					j = 0;
				}
			}
		}
		for( i = 0 ; i<a.length; i++) {
			for( j = 0 ; j<a[i].length ; j++) {
				System.out.printf("%2d " ,a[i][j]);	
			}
			System.out.println();
		}
	}
}
