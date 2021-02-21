import java.util.Scanner;
import java.util.Arrays;

public class Questioning_2981 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		int remain[] = new int[N], sumre = 0;
		for(int M = 2; M < arr[N - 1]; M++) {
			for(int i = 0; i < remain.length; i++) {
				remain[i] = arr[i] % M;
				sumre += remain[i];
			}
			if(remain[0] == sumre / remain.length) System.out.print(M + " ");
			sumre = 0;
		}
	}
}

//수정 