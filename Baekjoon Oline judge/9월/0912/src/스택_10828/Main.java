package Ω∫≈√_10828;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int top = -1;
		int[] arr = new int[10001];
		for(int tc = 0; tc < N; tc++) {
			String op = sc.next();
			if(op.equals("push")) {
				int num = sc.nextInt();
				arr[top+1] = num;
				top++;
			}else if(op.equals("pop")) {
				if(top >= 0) {
					System.out.println(arr[top]);
					top--;
				}
				else System.out.println("-1");
			}else if(op.equals("size")) {
				System.out.println(top+1);
			}else if(op.equals("empty")) {
				if(top >= 0) {
					System.out.println("0");
				}
				else System.out.println("1");
			}else if(op.equals("top")) {
				if(top >= 0) {
					System.out.println(arr[top]);
					
				}
				else System.out.println("-1");
			}
		}
	}

}
