package baekjoon_DivideConquer;
// 배열 구현은 성공... 메모리초과

import java.util.Scanner;

public class Z_1074 {
	static int map[][], r, c, cnt, size;
	
	public static void Divide(int istart, int jstart, int size) {
		if(size == 1) {
			for(int i = istart; i < istart + size; i++) {
				for(int j = jstart; j < jstart + size; j++) {
					map[i][j] = cnt++;
				}
			}
			return;
		}
		Divide(istart, jstart, size / 2);
		Divide(istart, jstart + size / 2, size / 2);
		Divide(istart + size / 2, jstart, size / 2);
		Divide(istart + size / 2, jstart + size / 2, size / 2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int r = sc.nextInt(); int c = sc.nextInt();
		size = (int)Math.pow(2, N);
		map = new int[size][size];
		
		Divide(0, 0, size);
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.printf("%10d", map[i][j]);
			}
			System.out.println();
		}
		System.out.println(map[r][c]);
	}
}

