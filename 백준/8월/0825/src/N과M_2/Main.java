package N°úM_2;

import java.util.Scanner;

public class Main {
	static int[] result;
	static boolean[] visited;
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		result = new int[M];
		visited = new boolean[N];
		Comb(0,0);
	}
 	static void Comb(int s_idx, int idx) {
 		if(s_idx == result.length) {
 			for(int i : result) {
 				System.out.print(i+" ");
 			}
 			System.out.println();
 			return;
 		}
 		
 		if(idx == visited.length) return;
 		
 		if(!visited[idx]) {
 			result[s_idx] = idx+1;
 			visited[idx] = true;
 			Comb(s_idx+1,idx+1);
 			visited[idx] = false;
 			Comb(s_idx, idx+1);
 		}
 		
 	}
}
