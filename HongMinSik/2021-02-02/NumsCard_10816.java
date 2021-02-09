package baekjoon_Search;
import java.util.Scanner;

public class NumsCard_10816 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cards[] = new int[20000001];
		for(int i = 0; i < N; i++) {
			cards[sc.nextInt()+10000000]++;
		}
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			System.out.print(cards[sc.nextInt() + 10000000] + " ");
		}
	}
}
