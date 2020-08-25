package 로또_6603;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 9;
		while(true) {
			n = sc.nextInt();
			if(n == 0) break;
			arr = new int[n];
			result = new int[6];
			visited = new boolean[n];
			for(int i = 0; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			comb(0,0);
			System.out.println();
		}
	}
	//순열이 아닌 조합을 구하고 출력 전에 Arrays.sort해서 오름차순 정렬을 해줘야 한다.
	static public void comb(int s_idx,int idx) {
		if(idx == result.length) {
			Arrays.sort(result);
			for(int i = 0;i< result.length; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		if(s_idx >= arr.length) return;
		
		if(!visited[s_idx]) {
			result[idx] = arr[s_idx];
			visited[s_idx] = true;
			comb(s_idx+1,idx+1);
			visited[s_idx] = false;
			comb(s_idx+1, idx);
		}
		
		
		
	}
}
