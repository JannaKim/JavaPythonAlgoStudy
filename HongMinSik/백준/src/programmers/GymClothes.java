package programmers;

public class GymClothes {
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		boolean[] checked = new boolean[n + 1];
		
		for(int i = 0; i < reserve.length; i++) {
			for(int j = 0; j < lost.length; j++) {
				if((reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]) && checked[reserve[i]] == false) {
					checked[reserve[i]] = true;
					answer++;
				}
			}
		}
		
		for(int i = 0; i < reserve.length; i++) {
			for(int j = 0; j < lost.length; j++) {
				if(reserve[i] == lost[j]) answer--;
			}
		}
		if(answer > n) answer = n;
		return answer;
	}
	
	public static void main(String[] args) {
		int lost[] = {2, 4};
		int reserve[] = {1, 3, 5};
		System.out.println(solution(5, lost, reserve));
	}
}