package baekjoon_Math;

public class SelfNumber_4673 {
	static boolean arr[] = new boolean[100001];
	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			int a = i;
			arr[i + a] = true;
			i++;
		}
		
		while(i < 100) {
			int a = i/10, b = i % 10;
			arr[i + a + b] = true;
			i++;
		}
		
		while(i < 1000) {
			int a = i / 100, b = (i / 10) % 10, c = i % 10;
			arr[i + a + b + c] = true;
			i++;
		}
		
		while(i < 10000) {
			int a = i / 1000, b = (i / 100) % 10, c = (i / 10) % 10, d = i % 10;
			if(i + a + b + c > 10000) {
				i++;
				continue;
			}
			arr[i + a + b + c + d] = true;
			i++;
		}
		
		for(i = 1; i < 10001; i++) {
			if(arr[i] == false) System.out.println(i);
		}
	}

}
