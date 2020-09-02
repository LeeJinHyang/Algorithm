package 연산자끼워넣기_14888;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	static int[] op;
	static int max;
	static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		result = new int[n-1];
		visited = new boolean[n-1];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		
		op = new int[n-1];
		for(int i = 0; i < 4; i++) {
			int count = sc.nextInt();
			for(int j = 0; j < count; j++) {
				op[sum] = i;
				sum++;
			}
		}
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		perm(0);
		
		System.out.println(max);
		System.out.println(min);
		
	}
	
	static void perm(int idx) {
		if(idx == result.length) {
			int sum = arr[0];
			for(int i = 0; i < result.length; i++) {
				System.out.println(i+" : "+result[i]);
				if(result[i] == 0) {
					sum  = sum + arr[i+1];
				}else if(result[i] == 1) {
					sum = sum - arr[i+1];
				}else if(result[i] == 2) {
					sum = sum * arr[i+1];
				}else if(result[i] == 3) {
					sum = sum % arr[i+1];
				}
			}
			System.out.println(sum);
			max = Math.max(max, sum);
			min = Math.min(min, sum);
			return;
		}
		for(int i = 0; i < op.length; i++) {
			if(!visited[i]) {
				result[idx] = op[i];
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
		
		
	}

}
