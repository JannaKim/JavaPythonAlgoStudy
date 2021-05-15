import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_18511 {
	
	private static int[] list;
	private static int N;
	private static int K;
	private static int ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		list = new int[K];
		for(int i=0; i<K; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
        Arrays.sort(list);
        recursive(0,1);
		System.out.println(ans);
	}
	
	public static void recursive(int num, int ten){
        if(num>N) return;
        ans = Math.max(ans, num);
        for(int i=K-1; i >= 0; i--){
            recursive(num + ten * list[i], ten*10);
        }
	}

}
