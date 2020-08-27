package 다음순열_10972;

import java.util.Scanner;

public class Main {
	static int[] answer;
	static int[] result;
	static boolean[] visited;
	static boolean flag;
	static int[] ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		answer = new int[N];
		result = new int[N];
		visited = new boolean[N];
		//ans = new int[N];
		flag = false;
		for(int i = 0; i < N; i++) {
			answer[i] = sc.nextInt();
		}
		Perm(0);
		if(ans == null) System.out.println("-1");
		else {
			for(int i : ans) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	static void Perm(int idx) {
		if(idx == result.length) {
			if(!flag) {
				flag = true;
				for(int i = 0; i < result.length; i++) {
				if(result[i] != answer[i]) {
					flag = false;
				}
			}
			}
			else {
				ans = new int[result.length];
				for(int i =0; i < result.length; i++) {
					ans[i] = result[i];
				}
				flag = false;
				return;
			}
			return;
		}
		for(int i =0; i < result.length; i++) {
			if(!visited[i]) {
				result[idx] = i+1;
				visited[i] = true;
				Perm(idx+1);
				visited[i] = false;
			}
		}
	}

}
