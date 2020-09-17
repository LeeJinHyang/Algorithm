package 암호만들기_1759;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char[] arr;
	static char[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int L = sc.nextInt();
		int C = sc.nextInt();
		arr = new char[C];
		visited = new boolean[C];
		result = new char[L];
		for(int i = 0; i < C; i++) {
			arr[i] = sc.next().charAt(0);
		}
		Arrays.sort(arr);
		Perm(0,0);
	}
	static public void Perm(int s_idx, int idx) {
		if(s_idx == result.length) {
			int cnt1 = 0;
			int cnt2 = 0;
			for(char i : result) {
				if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
					cnt1++;
				}
				else {
					cnt2++;
				}
			}
			if(cnt1 >= 1 && cnt2 >=2) {
			for(char i : result) {
				System.out.print(i);
			}
			System.out.println();
			}
			return;
		}
			
		if(idx == arr.length) return;
		
		result[s_idx] = arr[idx];
		Perm(s_idx+1, idx+1);
		Perm(s_idx,idx+1);
	}

}
