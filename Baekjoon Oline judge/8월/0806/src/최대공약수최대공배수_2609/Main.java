package 최대공약수최대공배수_2609;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = findNum(num1,num2);
		System.out.println(gcd);
		System.out.println(num1*num2 / gcd);
	}
	public static int findNum(int num1, int num2) {
		if(num1%num2 == 0) {
			return num2;
		}
		else return findNum(num2, num1%num2);
		
	}
}
