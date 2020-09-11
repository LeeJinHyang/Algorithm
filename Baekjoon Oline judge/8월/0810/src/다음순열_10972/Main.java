package 다음순열_10972;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static int[] result;
	static boolean[] visited;
	static int[] find;
	static int n;
	static boolean flag;
	static boolean flag2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		find = new int[n];
		result = new int[n];
		visited = new boolean[n];
		flag = false;
		for(int i = 0; i < n; i++) {
			find[i] = sc.nextInt();
		}

		perm(0);
		if(flag2) {
			for(int i = 0; i < n; i++) {
				System.out.print(find[i]+" ");
			}
			System.out.println();
		}
		else System.out.println("-1");
	}
	
	public static void perm(int idx) {
		if(idx == result.length) {
			if(flag) {
				flag2 = true;
				for(int i = 0; i < n; i++) {
					find[i] = result[i];
				}
				flag = false;
			}
			else {
			flag = true;
			
			for(int i = 0; i < n; i++) {
				if(result[i] != find[i]) {
					flag = false;
				}
			}
			}
			return;
		}
		for(int i = 0; i <n; i++ ) {
			if(!visited[i]) {
				result[idx] =i+1;
				visited[i] = true;
				perm(idx+1);
				visited[i] = false;
			}
		}
		
	} 

}
