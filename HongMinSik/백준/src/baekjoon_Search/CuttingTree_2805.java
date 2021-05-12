package baekjoon_Search;
import java.util.Arrays;
import java.util.Scanner;

public class CuttingTree_2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int M = sc.nextInt();
		int list[] = new int[N];
		
		for(int i = 0; i < N; i++) list[i] = sc.nextInt();
		
		Arrays.sort(list);
		int max = 0, height = 0, left = 1, right = list[N - 1], mid = 0, answer = 0;
		
		while(left <= right) {
			height = 0;
			mid = (left + right) / 2;
			for(int i = 0; i < N; i++) {
				if(mid <= list[i]) {
					height += (list[i] - mid);
				}
			}
			
			if(height >= M) {
				left = mid + 1;
			} else if(height < M) {
				right = mid - 1;
			}
		}
		
		System.out.println(right);
	}
}
