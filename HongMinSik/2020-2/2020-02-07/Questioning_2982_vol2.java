package baekjoon_Math;
import java.util.Scanner;
import java.util.Arrays;

public class Questioning_2982_vol2 {
	public static int gcd(int a, int b) {
		if(a % b == 0) return b;
		else return gcd(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		int gcdval = arr[1] - arr[0];
		for(int i = 2; i < N; i++) {
			gcdval = gcd(gcdval, arr[i] - arr[i-1]);
		}
		
		for(int M = 2; M <= gcdval; M++) {
			if(gcdval % M == 0) System.out.print(M + " ");
		}
		
		
	}
}
