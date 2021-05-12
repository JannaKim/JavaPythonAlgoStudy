package baekjoon_Greedy;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
// 1) 배열의 0부터 N - jarisu까지의 범위 중 최대값과 인덱스 찾기
// 2) 찾으면 인덱스 = i, 1)의 방법 재시도. 다만, 인덱스+1을 시작지점으로 한다.
// 3) 인덱스가 N - jarisu에 도달하면 그 이후의 값들을 모두 출력한다.

public class MakingBigger_2812 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int jarisu = N - K;
		String str = sc.next();
		int num[] = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray(); // 숫자 스플릿
		
		int max = 0, index = 0, cnt = 0;
		
		while(true) {
			for(int j = index; j < N; j++) {
				if(max < num[j]) {
					max = num[j];
					index = j;
				}
			}
			System.out.print(max);
			max = 0;
			index++;
			cnt++;
			if(cnt == jarisu) break;
		}
		for(int i = index; i < num.length; i++) System.out.print(num[i]);
	}
}