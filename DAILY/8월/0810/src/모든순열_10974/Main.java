package 모든순열_10974;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];
		for(int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		perm(0);
	}
	
	public static void perm(int idx) {
		if(idx == result.length) {
			for(int i = 0; i < result.length;i++ ) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = 0; i <arr.length; i++ ) {
			if(!visited[i]) {
				result[idx] = arr[i];
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
		
	} 

}
