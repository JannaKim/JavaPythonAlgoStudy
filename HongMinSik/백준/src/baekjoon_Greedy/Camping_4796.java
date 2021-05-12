package baekjoon_Greedy;
import java.util.Scanner;

public class Camping_4796 {

	public static void main(String[] args) {
		int l, p, v;
		Scanner sc = new Scanner(System.in);
		int tc = 1;
		while(true) {
			l = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();
			if(l == 0) break;
			System.out.println("Case " + tc + ": " + ((v/p)*l + Math.min(l, v%p)));
			tc++;
		}
	}

}
