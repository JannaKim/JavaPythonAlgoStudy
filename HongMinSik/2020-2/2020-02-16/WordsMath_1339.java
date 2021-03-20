
import java.util.Scanner;
import java.util.HashMap;

public class WordsMath_1339 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String words[] = new String[N];
		HashMap dict = new HashMap();
		
		for(int i = 0; i < N; i++) words[i] = sc.next();
		
		int max = 0, index = 0;
		while(true){
			for(int i = 0; i < words.length; i++) {
				if(max < words[i].length()) {
					max = words[i].length();
					index = i;
				}
			}
			// 가장 긴 단어를 먼저 찾아 길이의 값을 index로 설정...
			
			int num = 9;
			for(int i = 0; i < words[index].length(); i++) { // 가장 긴 단어에 대해서
				if(!dict.containsKey(words[index].charAt(i))) { // 만약, 키값(알파벳)이 딕셔너리에 없다면 
					dict.put(words[index].charAt(i), num--); // 키에대한 숫자를 딕셔너리에 대입후 num의 값 - 1
				}
			}
			
			// 다음으로는 index는 두번째로 긴 단어의 길이가 되어야 한다...(다음으로 찾는 단어의 길이가 첫번째로 길었던 단어의 길이와 같을 수도 있다... 수의 최대 길이는 8이다)
		}
	}
}
