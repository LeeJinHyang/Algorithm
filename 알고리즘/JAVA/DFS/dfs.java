import java.util.Stack;

public class dfs {
	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		arr[0][1] = 1;
		arr[1][0] = 1;
		arr[0][2] = 1;
		arr[2][0] = 1;
		arr[1][3] = 1;
		arr[3][1] = 1;
		arr[1][4] = 1;
		arr[4][1] = 1;
		arr[3][5] = 1;
		arr[5][3] = 1;
		arr[4][5] = 1;
		arr[5][4] = 1;
		arr[5][6] = 1;
		arr[6][5] = 1;
		arr[2][6] = 1;
		arr[6][2] = 1;
		boolean[] visited = new boolean[7];
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		while( !stack.isEmpty() ) {
			int v = stack.pop();
			if(!visited[v]) {
				System.out.println(v+1);
				visited[v] = true;
			}
			for(int i = 6; i >= 0; i--) {
				if( arr[v][i] == 1 && !visited[i] ) {
					stack.push(i);
				}
			}
		}
		
	}
}
