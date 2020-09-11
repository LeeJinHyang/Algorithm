package 최소공배수_1934;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =0; i< num; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int gcd = findGCD(num1, num2);
			
			System.out.println((num1*num2)/gcd);
			
		}
	}
	
	static public int findGCD(int num1, int num2) {
		if(num1 % num2 == 0) {return num2;}
		else return findGCD(num2, num1%num2);
	}

}
