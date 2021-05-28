import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	static int min;
	static int max;
	static char[] op;
	static int[] num;
	static char[] result;
	static boolean[] visited;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			op = new char[N-1];
			int plus = sc.nextInt();
			int idx = 0;
			for(int i = 0; i < plus; i++) {
				op[idx] = '+';
				idx++;
			}
			int minus = sc.nextInt();
			for(int i = 0; i < minus; i++) {
				op[idx] = '-';
				idx++;
			}
			int mul = sc.nextInt();
			for(int i = 0; i < mul; i++) {
				op[idx] = '*';
				idx++;
				}
			int div = sc.nextInt();
			for(int i = 0; i < div; i++) {
				op[idx] = '/';
				idx++;
			}
			
			num = new int[N];
			for(int i = 0; i < N; i++) {
				num[i] = sc.nextInt();
			}
			
			result = new char[N-1];
			visited = new boolean[N-1];
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			//부호들로 순열 만들고 그 만들어진 순열로 계산 수행한다
			Perm(0);
			System.out.println("#"+tc+" "+(max-min));
		}
	}
	static public void Perm(int idx) {
		if(idx == result.length) {
			int nums = calc(result);
			min = Math.min(min, nums);
			max = Math.max(max, nums);
			return;
		}
		for(int i = 0; i < result.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[idx] = op[i];
				Perm(idx+1);
				visited[i] = false; 
			}
		}
	}
	static public int calc(char[] op) {
		int result = num[0];
		
		for(int i = 0; i < (op.length); i++) {
			char ops = op[i];
			//System.out.print(ops+" ");
			int nums = num[i+1];
			if(ops =='+') {
				result += nums;
			}else if(ops =='-') {
				result -= nums;
			}else if(ops =='*') {
				result *= nums;
			}else if(ops =='/') {
				result /= nums;
			}
		}
		//System.out.println(result);
		return result;
	}
	

}
