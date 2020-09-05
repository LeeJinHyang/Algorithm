package °ýÈ£_9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int tc = 0; tc < n; tc++) {
			Stack<Character> stack = new Stack<>();
			String str = sc.next();
			for(int i = 0; i < str.length(); i++) {
				char tmp = str.charAt(i);
				if(!stack.isEmpty()&&tmp == ')') stack.pop();
				else if(tmp =='(') stack.add('(');
				else {
					stack.add(')');
					break;
				}
			}
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
