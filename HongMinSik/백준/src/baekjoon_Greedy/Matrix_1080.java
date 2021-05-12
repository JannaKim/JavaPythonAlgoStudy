package baekjoon_Greedy;

import java.util.Scanner;

public class Matrix_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int from[][] = new int[N][M];
		int trans[][] = new int[3][3];
		int to[][] = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				from[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				to[i][j] = sc.nextInt();
			}
		}
		
		
	}

}
