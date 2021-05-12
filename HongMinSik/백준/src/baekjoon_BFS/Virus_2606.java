package baekjoon_BFS;
import java.util.LinkedList;
import java.util.Queue;
// BFS로 구현, 큐를 이용한다. 큐는 링크드리스트를 이용하여 구현
import java.util.Scanner;

public class Virus_2606 {
	static boolean visited[]; // 방문 표시 
	static int adj[][]; // 인접행
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coms = sc.nextInt(), ssang = sc.nextInt(); 
		adj = new int[coms][coms];
		visited = new boolean[coms];
		
		for(int i = 0; i < ssang; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			adj[a - 1][b - 1] = adj[b - 1][a - 1] = 1;
		} // 인접행렬 값 대
		BFS(0);
	}
	
	public static void BFS(int start) { // BFS는 시작할 노드 값을 인자로 받아 구현한다. 인자값은 한개이다.
		Queue<Integer> q = new LinkedList<Integer>(); // BFS는 주로 큐를 이용하여 구현한다. 자바에서 큐는 링크드리스트 이용 
		q.add(start); // 큐에 탐색을 시작할 노드 값 대입 
		int cnt = 0;
		
		while(!q.isEmpty()) { // 큐가 비어있지 않는동안 수행 
			int tmp = q.poll(); // tmp에 시작 노드 값 대입.
			visited[tmp] = true; // 시작노드값에 대한 인덱스가 true로 바뀜.
			for(int i = 1; i < visited.length; i++) {
				if(adj[tmp][i] == 1 && visited[i] == false) { // 인접행렬의 값이 1이고 방문하지 않앗으면
					q.offer(i); // 큐에 노드 인접노드 삽입. 
					visited[i] = true; // 인접노드에 대한 인덱스를 방문처리
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

}
