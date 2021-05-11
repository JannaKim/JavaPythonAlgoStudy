package baekjoon_DP;

import java.util.Scanner;

public class PaskalsTriangle_16395 {
	public static int combination(int N, int R) {
		if(N == R || R == 0) return 1;
		else return combination(N - 1, R - 1) + combination(N - 1, R);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int R = sc.nextInt();
		System.out.println(combination(N - 1, R - 1));
	}
}
