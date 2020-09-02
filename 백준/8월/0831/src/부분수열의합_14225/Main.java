package 부분수열의합_14225;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static int[] result;
	static boolean[] check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		check = new boolean[100001*N];
		for(int i = 1; i <= N; i++) {
			visited = new boolean[N];
			result = new int[i];
			Comb(0,0);
		}
		int re = 0;
		for(int i = 1; i < 100001*N; i++) {
			if(!check[i]) {
				re = i;
				break;
			}
		}
		System.out.println(re);
	}
	static void Comb(int s_idx,int idx) {
		if(s_idx == result.length) {
			int sum = 0;
			for(int i : result) {
				sum += i;
			}
			check[sum] = true;
			return;
		}
		if(idx == arr.length) return;
		
		
		result[s_idx] = arr[idx];
		Comb(s_idx+1, idx+1);
		Comb(s_idx,idx+1);
		
	}

}
