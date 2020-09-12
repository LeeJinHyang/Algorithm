package 수들의합_2003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			int j = i;
			int sum = 0;
			while(sum <= M) {
				if(j >= N) break;
				sum += arr[j];
				if(sum == M) {
					count++;
					break;
				} 
				j++;
			}
		}
		System.out.println(count);
	}

}
