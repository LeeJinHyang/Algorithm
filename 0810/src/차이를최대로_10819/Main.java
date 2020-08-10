package 차이를최대로_10819;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	static int max;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];
		max = Integer.MIN_VALUE;
		for(int i= 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		perm(0);
		System.out.println(max);
		
	}
	static void perm(int idx) {
		if(idx == result.length) {
			int sum = 0;
			for(int i =0;i < result.length-1 ; i++) {
				sum += Math.abs(result[i]-result[i+1]);
			}
			max = Math.max(max, sum);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!visited[i]) {
				result[idx] = arr[i];
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
		
		
	}

}
