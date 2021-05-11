package baekjoon_DP;
import java.util.Scanner;

public class PuttingBridge_1010 {
	static int dp[][];
	public static int combination(int n, int r) {
		if(dp[n][r] > 0) return dp[n][r];
		if(n == r || r == 0) return dp[n][r] = 1;
		else return combination(n - 1, r - 1) + combination(n - 1, r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		dp = new int[T][T];
		int arr[][] = new int[T][2];
		
		for(int i = 0; i < T; i++) {
			arr[i][1] = sc.nextInt(); arr[i][0] = sc.nextInt();
		}
		
		for(int i = 0; i < T; i++) {
				System.out.println(combination(arr[i][0], arr[i][1]));
		}
	}
}
