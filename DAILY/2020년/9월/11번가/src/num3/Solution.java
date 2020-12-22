package num3;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,1};
		solution(A);
	}
	static int solution(int[] A) {
		int max = A.length;
		int answer = 0;
		
		boolean[] check = new boolean[max+1];
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < A.length; i++) {
			int num = A[i];
			if(check[num]) {
				list.add(i);
			} 
			else check[num] = true;
		}
		
		for(int i = 0; i < list.size(); i++) {
			int index = list.get(i);
			int num = A[index];
			
			for(int bias = 1; bias < max; bias++) {
				if(num + bias <= max && !check[num+bias]) {
					A[index] = num + bias;
					check[num + bias] = true;
					answer += bias;
					break;
				}
				else if(num - bias >= 1 && !check[num-bias]) {
					A[index] = num - bias;
					check[num - bias] = true;
					answer += bias;
					break;
				}
			}
		}
	
		return answer;
	}
}
