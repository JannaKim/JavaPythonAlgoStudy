

import java.util.LinkedList;
import java.util.Scanner;


public class SnailList_17827 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); int M = sc.nextInt(); int V = sc.nextInt();
		int arr[] = new int[N], index[] = new int[M];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < index.length; i++) {
			index[i] = sc.nextInt();
		}
		
		int a = --V;
		int looplen = N - a; //	달팽이 루프의 길이 
		for(int i = 0; i < index.length; i++) {
			if(index[i] < V) {
				System.out.println(arr[index[i]]); // V보다 작은 인덱스에 대해서는 그냥 출력 
			} else {
				System.out.println(arr[(index[i] - a) % looplen + a]);
			}
		}
	}
}
