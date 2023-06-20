import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 0;
		for(i = 1 ; i<=n ; i++) {
			++i;
		}
		System.out.println(i);
	}
}