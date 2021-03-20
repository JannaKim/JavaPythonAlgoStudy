import java.util.*;
//https://fbtmdwhd33.tistory.com/28

public class Virus_2606 {
	static int node[][];
	static boolean check[];
	
	static void BFS(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		check[start] = true;
		
		int cnt = 0;
		while(!queue.isEmpty()) {
			int x = queue.poll();
			for(int i = 1; i < node.length; i++) {
				if(node[x][i] == 1 && check[i] != true) {
					queue.offer(i);
					check[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		node = new int[n+1][n+1];
		check = new boolean[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			node[a][b] = node[b][a] = 1; 
		}
		
		for(int i = 1; i < node.length; i++) {
			for(int j = 1; j < node[i].length; j++) {
				System.out.print(node[i][j] + " ");
			}
			System.out.println();
		}
		
		BFS(1);
	}

}
