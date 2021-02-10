package baekjoon_Recursion;
import java.util.Scanner;
// https://shoark7.github.io/programming/algorithm/tower-of-hanoi
// 하노이탑 이동 횟수는 항상 2^(k-1)이다. (여기서 k는 층 수)

public class HanoiTower_11729 {
	public static void Hanoi(int N, int from, int to, int via) {
		// N=4일때 먼저 3개의 원반을 A->B으로 옮기는 경우(먼저 N-1개의 원반을 via로 옮겨야한다)
		// Hanoi(3, A, B, C) : N-1개의 원반을 옮겨야하므로 via가 C가 되어야 한다. (N번째 원반은 C로 옮겨야 하므로)

		/*
		comment by MinJaeKim

		애초에 N>=2일때 경유지가 필요한 이유가 원판을 쌓을때 위에것의 크기가 아래것보다 작아야하기 때문. 추가 해설은 아래 설명참고

		*** 비어있는 도착점에 가장 큰 원반을 먼저 놓는게 1차 목표라고 생각하고 시작. 도착점은 꼭 비워져있어야 함.

		원판을 (x) 라고 나타내고 x를 원판의 크기라 할 때,
		N==1은 (1)짜리를 옮겨야함
			(1) 짜리를 비어있는 도착점에 가장 먼저 놓는게 1차 목표임.
			근데 위에 애들부터 옮길 수 있으므로 (1)보다 위에있는 애들부터 처리해야함.
			근데 (1)보다 위에있는 애들이 없음
			그럼 그냥 (1) 짜리를 도착점에 옮길 수 있음.

		N==2는 (1)/(2) 짜리를 옮겨야함
			(2) 짜리를 비어있는 도착점에 가장 먼저 놓는게 1차 목표임.
			근데 위에 애들부터 옮길 수 있으므로 (2)보다 위에있는 애들부터 처리해야함
			도착점은 꼭 비워놓아야하므로 (1)을 잠시 둘 곳은 경유지뿐.
			그래서 (1) 을 경유지에 놓고, (2) 도착지에 옮겨놓은 후 경유지에 있는 (1)을 옮겨놓는 것임. 그래야 차곡차곡 쌓일것.

		N==3일 때는 (1)/(2)/(3) 짜리를 옮겨야함
			(3) 짜리를 비어있는 도착점에 가장 먼저 놓는게 1차 목표임.
			근데 위에 애들부터 옮길 수 있으므로 (3)보다 위에있는 애들부터 처리해야함
			도착점은 꼭 비워놓아야하므로 (3) 위에 (1)/(2)을 잠시 둘 곳은 경유지뿐.
			그래서 (1)/(2)을 경유지에 놓고, (3)을 도착지에 옮겨놓은 후 경유지에 있는 (1)/(2)을 옮겨놓는 것임.

			근데 (1)/(2) 짜리를 온전히 옮기는 방법은 N==2일 때의 방법과 동임함. 출발지와 도착지의 바닥번호만 다를뿐.
			그래서 재귀함수 쓸 수 있는 것임
		
		N==4일 때는 (1)/(2)/(3)/(4) 짜리를 옮겨야함
			(4) 짜리를 비어있는 도착점에 가장 먼저 놓는게 1차 목표임... 이하 반복
		*/
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