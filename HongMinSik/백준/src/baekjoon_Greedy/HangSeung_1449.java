package baekjoon_Greedy;
import java.util.Arrays;
import java.util.Scanner;
//wookje.dance/2018/02/02/boj-1449-%EC%88%98%EB%A6%AC%EA%B3%B5-%ED%95%AD%EC%8A%B9/
	
public class HangSeung_1449 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), L = scan.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int tmp = arr[0], cnt = 1;
		for(int i = 0; i < arr.length; i++) {
			if(tmp + L - 1 < arr[i]) {
				tmp = arr[i];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
