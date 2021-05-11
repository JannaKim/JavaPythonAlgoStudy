package baekjoon_Recursion;
import java.math.BigInteger;
import java.util.Scanner;

public class Combination_2407 {
	public static BigInteger dp[][];
	
	public static void Com(int n, int m) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j <= i; j++) {
				if(i == j || j == 0) dp[i][j] = new BigInteger("1");
				else dp[i][j] = dp[i-1][j-1].add(dp[i-1][j]);
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		dp = new BigInteger[n+1][n+1];
		Com(n, m);
		System.out.println(dp[n][m]);
	}

}
