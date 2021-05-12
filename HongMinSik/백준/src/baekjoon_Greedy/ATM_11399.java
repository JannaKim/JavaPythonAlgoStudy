package baekjoon_Greedy;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ATM_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList list = new ArrayList();
		for(int i = 0; i < num; i++) list.add(sc.nextInt());
		Collections.sort(list);
		int sum = 0, total = 0;
		int arr[] = new int[num];
		for(int i = 0; i < num; i++) {
			sum += (int)list.get(i);
			arr[i] = sum;
			total += arr[i];
		}
		System.out.println(total);
	}

}
