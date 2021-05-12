package baekjoon_Greedy;
import java.util.Arrays;
import java.util.Scanner;

public class Rope_2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[0] * arr.length;
		for(int i = 0; i < arr.length; i++)
			if(max < arr[i] * (arr.length - i)) {
				max = arr[i] * (arr.length - i);
			}
		System.out.println(max);
		sc.close();
	}

}
