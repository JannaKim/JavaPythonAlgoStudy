import java.util.*;

public class BOJ_17478_WatIsRec {
	
	static String sArr[];
	static String bar = "____";
	static int i = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

		sArr = new String[6];
		for(int i=0; i<sArr.length; i++) sArr[i] = "";
		sArr[0] = "\"재귀함수가 뭔가요?\"";
		sArr[1] = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
		sArr[2] = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
		sArr[3] = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
		sArr[4] = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
		sArr[5] = "라고 답변하였지.";
		
		recursive(N);
		sc.close();
	}
	public static void answer(int n) {
		for(int i=n; i>0; i--)
			System.out.println(bar.repeat(i)+sArr[5]);
	}
	public static void recursive(int n){
		if(n==0) {
			System.out.println(bar.repeat(i)+sArr[0]);
			System.out.println(bar.repeat(i)+sArr[4]);
			for(int j=i; j>=0; j--) {
				System.out.println(bar.repeat(j)+sArr[5]);
			}
			return;
		}
		System.out.println(bar.repeat(i)+sArr[0]);
		System.out.println(bar.repeat(i)+sArr[1]);
		System.out.println(bar.repeat(i)+sArr[2]);
		System.out.println(bar.repeat(i)+sArr[3]);
		i++;
		recursive(n-1);
	}

}
