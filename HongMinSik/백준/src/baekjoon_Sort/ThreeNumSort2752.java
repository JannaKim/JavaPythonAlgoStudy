package baekjoon_Sort;

import java.util.Scanner;

public class ThreeNumSort2752 {
	static int arr[] = new int[3];
	
	public static void main(String[] args) {
		int i, j, min, index, temp;
		Scanner sc = new Scanner(System.in);
		for(int a = 0; a < 3; a++) {
			arr[a] = sc.nextInt();
		}
		for(i = 0; i < 3; i++) {
			min = 1000001;
			for(j = i; j < 3; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
					temp = arr[i];
					arr[i] = arr[index];
					arr[index] = temp;
				}
			}	
		}
		
		for(i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
