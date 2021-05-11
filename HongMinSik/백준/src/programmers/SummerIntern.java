package programmers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class SummerIntern {
	    public static int[] solution(String code, String day, String[] data) {
	    	int[] answer;
	    	String[][] info = new String[data.length][2];
	    	ArrayList<Integer> list = new ArrayList();
	    	
	    	for(int i = 0; i < info.length; i++) {
	    		for(int j = 0; j < 2; j++) {
	    			info[i][j] = " ";
	    		}
	    	}
	    	
	    	for(int i = 0; i < data.length; i++) {
	    		if(data[i].contains(code) && data[i].contains(day)) {
	    			info[i][0] = data[i].substring(6, data[i].indexOf(" "));
	    			info[i][1] = data[i].substring(data[i].indexOf("time=") + 13);
	    		}
	    	}
	    	
	    	Arrays.sort(info, Comparator.comparing(o1 -> o1[1]));
	    	
	    	for(int i = 0; i < info.length; i++) {
	    		if(info[i][0] == " ") continue;
	    		list.add(Integer.parseInt(info[i][0]));
	    	}
	    	
	    	answer = new int[list.size()];
	    	
	    	
	    	for(int i = 0; i < list.size(); i++) {
	    		answer[i] = list.get(i);
	    	}
	    	
	    	return answer;
	    }
	public static void main(String[] args) {

	}
}
