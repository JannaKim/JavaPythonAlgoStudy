package baekjoon_DivideConquer;
import java.util.Scanner;

public class MakingPaper_2630 {
	static int map[][];
	static int N, white = 0, black = 0;
	
	public static void Divide(int horizon, int vertical, int row, int col) {
		int sum = 0;
		
		for(int i = horizon; i < row; i++) {
			for(int j = vertical; j < col; j++) {
				sum += map[i][j];
			}
		}
		
		if(sum == ((col - vertical) * (row - horizon))) {
			black++;
			return;
		}
		
		if(sum == 0) {
			white++;
			return;
		}
		
		Divide(horizon, vertical, (horizon + row) / 2, (vertical + col) / 2); // 1사분면(i의 초기값은 고정 / 상한은 가변, j의 초기값은 고정 / 상한은 가변)
		Divide((horizon + row) / 2, vertical, row, (vertical + col) / 2); // 2사분면(i의 초기값은 가변 / 상한은 고정, j의 초기값은 고정 / 상한은 가변)
		Divide(horizon, (vertical + col) / 2, (horizon + row) / 2, col); // 3사분면(i의 초기값은 고정 / 상한은 가변, j의 초기값은 가변 / 상한은 고정)
		Divide((horizon + row) / 2, (vertical + col) / 2, row, col); // 4사분면(i의 초기값은 가변 / 상한은 고정, j의 초기값은 가변 / 상한은 고정)
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		Divide(0, 0, N, N);
		
		System.out.println(white);
		System.out.println(black);
	}

}
