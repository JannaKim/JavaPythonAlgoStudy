

import java.util.Scanner;

public class FergusonAndApple_2942 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt(), G = sc.nextInt();
		
		for(int i = 1; i < Math.max(R, G); i++) {
			if(R % i == 0 && G % i == 0) {
				System.out.println(i + " " + R / i + " " + G / i);
				continue;
			}
		}
	}

}
