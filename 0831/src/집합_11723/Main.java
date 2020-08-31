package С§Че_11723;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		List<String> arr  = new ArrayList<>();
		int idx = 0;
		StringBuilder std = new StringBuilder();
		for(int i = 0; i < M; i++) {
			String str = sc.next();
			if(!(str.equals("all")||str.equals("empty"))) {
				String num = sc.next();
				if(str.equals("add")) {
					if(!arr.contains(num)) arr.add(num);
				}else if(str.equals("remove")) {
					if(arr.contains(num)) arr.remove(num);
				}else if(str.equals("check")) {
					if(arr.contains(num)) std.append("1\n");
					else std.append("0\n");			
				}else if(str.equals("toggle")) {
					if(arr.contains(num)) arr.remove(num);
					else arr.add(num);
				}
			}
			else {
				if(str.equals("all")) {
					arr.clear();
					for(int t = 1; t <= 20; t++) {
						arr.add(Integer.toString(t));
					}
				}else if(str.equals("empty")) {
					arr.clear();
				}
			} 
				
		}
		System.out.println(std.toString());
	}

}
