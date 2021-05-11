package baekjoon_DivideConquer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class CantorSet_4779 {
	static void Cantor(int N) {
		if(N == 1) {
			System.out.print("-");
		} else {
			Cantor(N / 3);
			for(int i = 0; i < N / 3; i++) System.out.print(" ");
			Cantor(N / 3);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		Vector<Integer> v = new Vector<Integer>();

		while(!(input = br.readLine()).isEmpty()) v.add(Integer.parseInt(input));
		
		for(int i = 0; i < v.size(); i++) {
			Cantor((int)Math.pow(3, v.get(i)));
			System.out.println();
		}
	}
}