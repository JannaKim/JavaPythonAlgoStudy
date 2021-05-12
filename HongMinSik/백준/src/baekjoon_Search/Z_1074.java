package baekjoon_Search;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
	static int N, r, c, count = 0;
	static int stoi(String s) { return Integer.parseInt(s); }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = stoi(st.nextToken());
		r = stoi(st.nextToken());
		c = stoi(st.nextToken());
		
		int n = getSize(N), count = 0, x = 0, y = 0;
		
		while(n > 0) {
			n /= 2;
			if(r < x+n && c < y+n) {
				count += n * n * 0;
			} // 2사분면
			
			else if(r < x+n) {
				count += n * n * 1;
				y += n;
			} // 1사분면
			
			else if(c < y+n) {
				count += n * n * 2;
				x += n;
			} // 3사분면
			
			else { 
				count += n * n * 3; 
				x += n; y += n; 
				}
			
			if(n == 1) {
				System.out.println(count);
				break;
			}
		}
	}
	
	static int getSize(int n) {
		int result = 1;
		for(int i = 0; i < n; i++) result *= 2;
		return result;
	}
}
