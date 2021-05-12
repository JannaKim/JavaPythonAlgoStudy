package baekjoon_Search;
import java.util.Arrays;
import java.util.Scanner;

public class FindingNum_1920 {
	public static int BS(int arr[], int num) {
		int right = arr.length - 1, left = 0, mid;
		while(right >= left) {
			mid = (left + right) / 2;
			if(arr[mid] == num)
				return 1;
			else if(num < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[sc.nextInt()];
		for(int i = 0; i < arr1.length; i++) arr1[i] = sc.nextInt();
		Arrays.sort(arr1);
		
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) System.out.println(BS(arr1, sc.nextInt()));
	}

}
