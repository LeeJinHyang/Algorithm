package ㅜㅕㅡ1;

import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("aabaa");
	}
	static int solution(String S) {
		
		if(S.contains("aaa")) return -1;
		int num_a = 0;
		int need_a = 2;
		
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i)=='a') {
				num_a ++;
			}
			else {
				need_a += 2;
			}
			
		}
		System.out.println(need_a - num_a);
		
		
		return need_a - num_a;
	}
}
