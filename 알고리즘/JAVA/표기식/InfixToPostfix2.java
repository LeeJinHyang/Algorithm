import java.util.Stack;

public class InfixToPostfix2 {
	static int prec(char op) {
		switch(op) 	{
			case '(': case ')': return 0;
			case '+': case '-': return 1;
			case '*': case '/': return 2;
		}
	return -1;
	}
	public static void main(String[] args) {
		String expr = "2+3*2+1*3";
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			switch(c) {
			case '(':
				stack.push(c);
				break;
			case ')':
				char top;
				while((top = stack.pop()) != '(') {
					System.out.print(top);
				}
			case '+':
			case '-':
			case '*':
			case '/':
				while( !stack.empty() && prec(c) <= prec(stack.peek()) )
					System.out.print(stack.pop());
				stack.push(c);
				break;
			default:
				System.out.print(c);
				break;	
			}
		}
		while(!stack.empty())
			System.out.print(stack.pop());
	}
}
