package baekjoon_implementation;
import java.util.Scanner;

public class Frequencyofnum_14912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int d = sc.nextInt();
    	int cnt = 0;
    	for(int i = 1; i <= n; i++){
    		int tmp = i;
    		while(tmp > 0) {
    			if(tmp % 10 == d) {
    				cnt++;
    			}
    		tmp /= 10;
    		}
    	}
    	System.out.println(cnt);
	}
}
