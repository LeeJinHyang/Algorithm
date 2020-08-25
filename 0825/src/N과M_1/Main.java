package N°úM_1;

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
 	
 		Perm(0);
	}
 	static void Perm(int idx) {
 		if(idx == result.length) {
 			for(int i : result) {
 				System.out.print(i+" ");
 			}
 			System.out.println();
 			return;
 		}
 		
 		for(int i = 0; i < visited.length; i++ ) {
 			if(!visited[i] ) {
 				result[idx] = i+1;
 				visited[i] = true;
 				Perm(idx+1);
 				visited[i] = false;
 			}
 		}
 	}

}
