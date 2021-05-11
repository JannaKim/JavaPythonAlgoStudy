package baekjoon_DP;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci4_10826 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger[] dp = new BigInteger[n + 1];
		dp[0] = BigInteger.ZERO;
		dp[1] = BigInteger.ONE;
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i - 2].add(dp[i - 1]);
		}
		System.out.println(dp[n]);
	}

}
