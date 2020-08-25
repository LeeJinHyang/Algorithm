package N°úM_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		arr = new int[N];
		visited = new boolean[N];
		result = new int[M];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
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
		
		for(int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				result[idx] = arr[i];
				visited[i] = true;
				Perm(idx+1);
				visited[i] = false;
			}
		}
	}

}
