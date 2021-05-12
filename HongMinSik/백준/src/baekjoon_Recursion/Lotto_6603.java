package baekjoon_Recursion;
import java.util.Scanner;

public class Lotto_6603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[] = new int[k];
		while(k != 0) {
			for(int i = 0; i < k; i++) {
				arr[i] = sc.nextInt();
			}
			k = sc.nextInt();
		}
	}

}
