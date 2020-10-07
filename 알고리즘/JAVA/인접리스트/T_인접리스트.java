import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 인접리스트 {
	static int N;
	static int M;
	static int V;
	static boolean[] visited;
	static List<Integer>[] adj;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		adj = new ArrayList[N+1];
		for(int i = 1; i <= N; i++)
			adj[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a].add(b);
			adj[b].add(a);
		}
		//문제에서는 작은 정점부터 방문해야 하므로, 정렬
		for(int i = 1; i <= N; i++)
			Collections.sort(adj[i]);
		
	}
}




