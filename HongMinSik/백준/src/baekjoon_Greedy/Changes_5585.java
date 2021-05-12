package baekjoon_Greedy;
import java.util.Scanner;

public class Changes_5585 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int change = 1000 - pay;
		int cnt = 0;
		int arr[] = {500, 100, 50, 10, 5, 1};
		for(int i = 0; i < 6; i++) {
			cnt += change / arr[i];
			change %= arr[i];
		}
		System.out.println(cnt);
	}

}
