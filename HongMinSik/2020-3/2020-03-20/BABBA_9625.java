package baekjoon_DP;
import java.util.Scanner;
// i > 1이면 
// [i]번째 A의 갯수 = [i-1]번째 B의 갯수
// [i]번째의 B의 갯수 = [i-1]번째 A의 갯수 + [i-1]번째 B의 갯수

public class BABBA_9625 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int dp[] = new int[46];
		dp[0] = 0;
		dp[1] = 1;
		for(int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[K - 1] + " " + dp[K]);
	}

}
