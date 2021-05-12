package baekjoon_Greedy;
import java.util.Scanner;
public class TurnNumsOver_1439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char tmp = S.charAt(0);
		int index;
		int[] count = {0, 0};
		
		for(int i = 0; i < S.length(); i++) {
			if(tmp != S.charAt(i)) {
				index = i;
				tmp = S.charAt(i);
				count[(int)tmp - 48]++;
			}
			if(i == S.length() - 1) {
				if(S.charAt(i) == '1') count[0]++;
				else count[1]++;
			}
		}
		System.out.println(Math.min(count[0], count[1]));
	}
}
