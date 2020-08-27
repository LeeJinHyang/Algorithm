package 부분수열의합_1182;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static int[] result;
	static int S;
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		visited = new boolean[N];
		count = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i <= N; i++) {
			result = new int[i];
			Comb(0, 0);
		}
		System.out.println(count);
	}

	static void Comb(int idx, int s_idx) {
		if (s_idx == result.length) {
			int sum = 0;
			for (int i : result) {
				sum += i;
			}
			if (sum == S)
				count++;
			return;
		}
		if (idx == arr.length)
			return;

		result[s_idx] = arr[idx];
		Comb(idx + 1, s_idx + 1);
		Comb(idx + 1, s_idx);

	}

}
