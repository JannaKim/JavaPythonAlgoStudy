package baekjoon_Sort;
import java.util.Scanner;

public class Simple_Sort2750 {
	static int arr[] = new int[1001];
	
	public static void main(String[] args) {
		int num, i, j, min, index, temp;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int a = 0; a < num; a++) {
			arr[a] = sc.nextInt();
		}
		for(i = 0; i < num; i++) {
			min = 1001;
			for(j = i; j < num; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
					temp = arr[i];
					arr[i] = arr[index];
					arr[index] = temp;
				}
			}	
		}
		
		for(i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}
}
