

import java.util.Scanner;

public class Differential_14731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C[] = new long[N], K[] = new long[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt(); K[i] = sc.nextInt();
			sum += C[i] * K[i] * Math.pow(2, K[i]-1);
		}
		
		System.out.println(sum % (Math.pow(10, 9) + 7));
	}

}
