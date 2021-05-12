package etc;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class DeutBoJob_1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		HashSet<String> set = new HashSet();
		int cnt = 0;
		ArrayList<String> list = new ArrayList();
		String str = "";
		
		for(int i = 0; i < N; i++)
			set.add(sc.next());
		
		for(int j = 0; j < M; j++) {
			str = sc.next();
			if(set.contains(str)) {
				cnt++;
				list.add(str);
			}
		}
		
		Iterator it = list.iterator();
		
		System.out.println(cnt);
		list.sort(null);
		for(int i = 0; i < list.size(); i++) System.out.println(list.get(i));
	}
}
