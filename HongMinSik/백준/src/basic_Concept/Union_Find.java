package basic_Concept;

public class Union_Find {
	public static int getParent(int parent[],int x) {
		if(parent[x] == x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}
	
	public static void unionParent(int parent[], int a, int b) {
		a = getParent(parent, a); // a번째 인덱스의 원소와
		b = getParent(parent, b); // b번째 인덱스의 원소 값을 가져와서
		if(a < b) parent[b] = a; // 비교하여 더 큰놈은 작은놈을 부모로 가지게 된다
		else parent[a] = b;
	}
	
	public static boolean findParent(int parent[], int a, int b) { // a번째 인덱스와 b번째 인덱스의 부모가 같은지 비교함
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a == b) return true;
		else return false;
	}

	public static void main(String[] args) {
		int parent[] = new int[11];
		for(int i = 1; i < 11; i++) parent[i] = i;
		unionParent(parent, 1, 2);
		unionParent(parent, 2, 3);
		unionParent(parent, 3, 4);
		unionParent(parent, 5, 6);
		unionParent(parent, 6, 7);
		unionParent(parent, 7, 8);
		System.out.println("1과 5는 연결 되어 있나영? " + findParent(parent, 1, 5));
		unionParent(parent, 1, 5);
		System.out.println("1과 5는 연결 되어 있나영? " + findParent(parent, 1, 5));

	}
}

// 커밋 수정