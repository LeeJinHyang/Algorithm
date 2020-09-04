package 단어뒤집기_9093;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		StringBuilder std = new StringBuilder();
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			for(int j = 0; j < str.length(); j++) {
				char tmp = str.charAt(j);
				if(tmp == ' ') {
					while(!stack.isEmpty()) {
						char chartmp = stack.pop();
						std.append(chartmp);
					}
					std.append(" ");
				}
				else {
					stack.add(tmp);
				}
			}
			while(!stack.isEmpty()) {

				char chartmp = stack.pop();
				std.append(chartmp);
			}
			std.append("\n");
		}
		System.out.println(std.toString());
	}

}
