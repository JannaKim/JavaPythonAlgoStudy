package baekjoon_Math;
import java.util.Scanner;

public class Combination_11050 {
	public static int combination(int N, int K) {
		if(N == K || K == 0) return 1;
		else return combination(N - 1, K - 1) + combination(N - 1, K);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		System.out.println(combination(N, K));
	}
}
