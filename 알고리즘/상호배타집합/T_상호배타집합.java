import java.util.Arrays;
import java.util.Scanner;

public class 상호배타집합 {
	static int[] parents;
	static int[] rank;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parents	 = new int[N+1];
		rank = new int[N+1];
		for(int i = 1; i <= N; i++)
			parents[i] = i;
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			union(a, b);
		}
		//자기 자신이 대표자인 수가 집합의 수. 종교의 수
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			if( i == find(i) )
				cnt++;
		}
		System.out.println(Arrays.toString(parents));
		System.out.println(cnt);
	}

	static int find(int x) {
		if (x == parents[x])
			return x;
		else
			parents[x] = find(parents[x]);
			return parents[x];
	}
	static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		if( rank[px] > rank[py]) {
			parents[py] = px;
		}
		else if(rank[px] < rank[py] ) {
			parents[px] = py;
		}
		else {
			rank[px]++;
			parents[py] = px;
		}
	}
}












