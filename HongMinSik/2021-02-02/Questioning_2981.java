import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Questioning_2981 {
	static int N;
	static int arr[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		int val = arr[1] - arr[0];
		System.out.println("val : " + val);
		
		for(int i = 2; i < N; i++) {
			val = GCD(val, arr[i] - arr[i-1]);
			System.out.println(val);
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 2; i <= val; i++) {
			if(val % i == 0) {
				sb.append(i + " ");
			}
		}
		System.out.println(sb.toString());
		
	}
	
	public static int GCD(int a, int b) {
		if(a%b == 0) return b;
		return GCD(b, a % b);
	}
}
