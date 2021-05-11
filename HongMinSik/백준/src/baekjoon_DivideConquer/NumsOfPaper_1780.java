package baekjoon_DivideConquer;
import java.io.*;
import java.util.StringTokenizer;

public class NumsOfPaper_1780 {
	static int N;
	static int result[] = new int[3];
	static int arr[][];
	
	public static boolean Check(int istart, int jstart , int size) {
		int start = arr[istart][jstart];
			for(int i = istart; i < istart + size; i++) {
				for(int j = jstart; j < jstart + size; j++) {
					if(start != arr[i][j]) return false;
			}
		}
		return true;
	}
	
	public static void Divide(int istart, int jstart, int size) {
		if(Check(istart, jstart, size)) { result[ arr[istart][jstart] + 1 ]++; return; }
		else {
			Divide(istart, jstart, size / 3); // 1번
			Divide(istart + size / 3, jstart, size / 3); // 2번
			Divide(istart + 2 * size / 3, jstart, size / 3); // 3번
			
			Divide(istart, jstart + size / 3, size / 3); // 4번
			Divide(istart + size / 3, jstart + size / 3, size / 3); // 5번
			Divide(istart + 2 * size / 3, jstart + size / 3, size / 3); // 6번
			
			Divide(istart, jstart + 2 * size / 3, size / 3); // 7번
			Divide(istart + size / 3, jstart + 2 * size / 3, size / 3); // 8번
			Divide(istart + 2 * size / 3, jstart + 2 * size / 3, size / 3); // 9번
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		arr = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Divide(0, 0, N);

		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
	}
}
