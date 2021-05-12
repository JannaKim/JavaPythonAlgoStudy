package baekjoon_Recursion;
import java.util.Scanner;

// 하노이탑 이동 횟수는 항상 2^(k-1)이다. (여기서 k는 층 수)

public class HanoiTower_11729 {
	public static void Hanoi(int N, int from, int to, int via) {
		// N=4일때 먼저 3개의 원반을 A->B으로 옮기는 경우(먼저 N-1개의 원반을 via로 옮겨야한다)
		// Hanoi(3, A, B, C) : N-1개의 원반을 옮겨야하므로 via가 C가 되어야 한다. (N번째 원반은 C로 옮겨야 하므로)
		if(N == 1) move(1, from, to);
		else {
			Hanoi(N-1, from, via, to);
			move(N, from, to); // N번째 원반이 A -> B로 이
			Hanoi(N-1, via, to, from);
			// B에 있는 N-1개의 원반들을 A를 경유지로 삼아 C로 옮겨져야 한다.
		}
	}
	
	public static void move(int N, int from, int to) {
		System.out.println(from + " " + to);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((int)Math.pow(2, N) - 1);
		Hanoi(N, 1, 3, 2);
	}

}