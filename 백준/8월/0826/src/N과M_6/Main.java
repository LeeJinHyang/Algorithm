package N°úM_6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int[] result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[N];
		result = new int[M];
		
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		Comb(0,0);
		
		
	}
	static void Comb(int s_idx, int idx) {
		if(s_idx == result.length) {
			for(int i : result) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
			
		}
		if(idx == arr.length) return;
		
		
		result[s_idx] = arr[idx];
		Comb(s_idx+1, idx+1);
		Comb(s_idx,idx+1);
		
	}
	
	
	

}
