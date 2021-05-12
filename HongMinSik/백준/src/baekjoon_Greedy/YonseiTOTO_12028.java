package baekjoon_Greedy;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class YonseiTOTO_12028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	ArrayList list = new ArrayList();
    	ArrayList<Integer> mile = new ArrayList();
    	int subjects = sc.nextInt(), mileage = sc.nextInt();
    	int cnt = 0;
    	
    	for(int i = 0; i < subjects; i++) {
    		int applicants = sc.nextInt(), capacities = sc.nextInt();
    		for(int j = 0; j < applicants; j++) {
    			list.add(sc.nextInt());
    		}
    		Collections.sort(list, Collections.reverseOrder());
    		if(applicants >= capacities) { 
    			mile.add((Integer)list.get(capacities-1));
    		} else { mile.add(1); }
    		list.clear();
    	}
    	
    	mile.sort(null);
    	
    	for(int i = 0; i < mile.size(); i++) {
    		if(mileage - mile.get(i) < 0) break;
    		mileage = mileage - mile.get(i);
    		cnt++;
    	}
    	System.out.println(cnt);
	}
}
