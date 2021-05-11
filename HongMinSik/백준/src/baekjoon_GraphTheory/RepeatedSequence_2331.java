package baekjoon_GraphTheory;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepeatedSequence_2331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); int P = sc.nextInt();
		LinkedHashSet<Integer> set = new LinkedHashSet();
		set.add(A);
		
		while(true) {
			int sum = 0;
			while(A > 0) {
				sum += Math.pow(A % 10, P);
				A /= 10;
			}
			if(set.contains(sum)) break;
			set.add(sum);
			A = sum;
		}
				
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}