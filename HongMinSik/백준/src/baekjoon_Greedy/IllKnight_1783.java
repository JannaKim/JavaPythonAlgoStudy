package baekjoon_Greedy;
import java.util.Scanner;
//https://lipcoder.tistory.com/entry/%EB%B3%91%EB%93%A0-%EB%82%98%EC%9D%B4%ED%8A%B8-%EB%B0%B1%EC%A4%80-1783%EB%B2%88

public class IllKnight_1783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		if(N == 1) System.out.println(1);
		else if(N == 2) System.out.println(Math.min(4, (M + 1) / 2));
		else if(M < 7) System.out.println(Math.min(4, M));
		else System.out.println(M - 7 + 5);
	}

}
