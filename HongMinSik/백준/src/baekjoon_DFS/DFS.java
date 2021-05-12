package baekjoon_DFS;

import java.util.Scanner;

public class DFS {
	static int adj[][], N, S;
	static boolean visited[];
	public static void DFS(int start) {
		visited[start] = true;
		for(int i = 1; i < visited.length; i++) {
			if(adj[start][i] == 1 && visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); S = sc.nextInt();
		adj = new int[N][N];
		visited = new boolean[N];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			adj[a][b] = adj[b][a] = 1;
		}
		
		DFS(0);
	}
}
