package baekjoon_Greedy;
import java.util.Scanner;

public class FoldingPaper_1802 {
	public static boolean Check(String arr[], int s, int e) {
		if(s >= e) return true;
		int l = s, r = e;
		while(l < r) {
			if(arr[l] == arr[r]) return false;
			l++; r++;
		}
		return Check(arr, s, r-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String arr[] = new String[t];
		for(int i = 0; i < t; i++) {
			arr[i] = sc.next();
			if(arr.length%2 == 0) System.out.println("NO");
			else if(Check(arr, 0, arr.length)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
