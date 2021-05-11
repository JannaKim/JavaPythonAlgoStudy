package programmers;
public class Network {
	static boolean[] checked;
	public static int Solution(int start, int computers[][]) {
		int answer = 0;
		checked = new boolean[computers.length];
		for(int i = 0; i < start; i++) {
			if(!checked[i]) {
				DFS(computers, i, checked);
				answer++;
			}
		}
		
		return answer;
	}
	
	static boolean[] DFS(int[][] computers, int start, boolean[] checked) {
		checked[start] = true;
		for(int i = 0; i < computers.length; i++) {
			if(computers[start][i] == 1 && checked[i] == false) {
				checked = DFS(computers, i, checked);
			}
		}
		return checked;
	}

	public static void main(String[] args) {
		int computers[][] = {{1,1,0},{1,1,1},{0,1,1}};
		System.out.println(Solution(3, computers));
	}

}
