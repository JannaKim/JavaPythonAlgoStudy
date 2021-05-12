package baekjoon_Search;
import java.util.Scanner;

public class SumofNums_1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double a = 0.5 + (0.5 * Math.sqrt(1 + 8*N));
		System.out.println((int) a - 1);
	}
}
