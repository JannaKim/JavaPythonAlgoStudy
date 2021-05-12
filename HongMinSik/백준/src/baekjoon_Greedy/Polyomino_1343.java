package baekjoon_Greedy;
import java.util.Scanner;

public class Polyomino_1343 {
	public static void main(String[] args) {
		String pola = "AAAA", polb = "BB";
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String arr[] = x.split("\\.");
		
		for(int i = 0; i < arr.length; i++) System.out.println(arr[i].length());
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() % 4 == 2) {
				arr[i] = pola.repeat(arr[i].length() / 4) + polb;
			} else if (arr[i].length() % 4 == 0 || arr[i].length() % 2 == 0 ) {
				arr[i] = pola.repeat(arr[i].length() / 4);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length - 1) System.out.print(".");
		}
	}
}
