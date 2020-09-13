package 연산자끼워넣기_14888;

import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] op;
	static long max;
	static long min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		op = new int[4];
		for(int i = 0; i < 4; i++) {
			op[i] = sc.nextInt();
		}
		max = Long.MIN_VALUE;
		min = Long.MAX_VALUE;
		DFS(0,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
	
	static void DFS(int count, int num) {
		if(count == arr.length-1) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i = 0; i < 4; i ++) {
			if(op[i] != 0) {
				if(i == 0) {
					op[i]--;
					DFS(count+1, num + arr[count+1]);
					op[i]++;
				}else if(i==1) {

					op[i]--;
					DFS(count+1, num - arr[count+1]);
					op[i]++;
				}else if(i==2) {

					op[i]--;
					DFS(count+1, num * arr[count+1]);
					op[i]++;
				}else {

					op[i]--;
					DFS(count+1, num / arr[count+1]);
					op[i]++;
				}
				
				
				
			}
			
			
			
		}
		
		
		
	}
	

}
