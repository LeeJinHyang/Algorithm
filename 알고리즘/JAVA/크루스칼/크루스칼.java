package 크루스칼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 크루스칼 {
	static class Node{
		int x; 
		int y;
		int val;
		public Node(int x, int y, int val) {
			super();
			this.x = x;
			this.y = y;
			this.val = val;
		}
		
	}
	static int[] parents;
	static List<Node> nodelist = new ArrayList<Node>();
	static int Sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parents = new int[8];
		for(int i = 1; i < 8; i++)
			parents[i] = i;
		
		makeNode();
		sortNode();
		int Cnt = 0;
		Sum = 0;
		for(Node node : nodelist) {
			boolean flag = union(node.x,node.y);
			if(flag) {Cnt++;
			Sum += node.val;
			} 
			if(Cnt == 6) break;
		}
		System.out.println(Sum);
	}
	static int find(int x) {
		if(x == parents[x]) return x;
		else return find(parents[x]);
	}
	static boolean union(int x, int y) {
		int px =  find(x);
		int py = find(y);
		
		boolean flag  = true;
		if(px > py) parents[x] = py;
		else if (px < py) parents[y] = px;
		else {
			flag = false;
		}
		
		return flag;
	}
	
	static void sortNode() {
		Comparator<Node> com = new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.val-o2.val;
			}
		};
		Collections.sort(nodelist,com);
	}
static void makeNode() {
	nodelist.add(new Node(1,7,12));
	nodelist.add(new Node(1,4,28));
	nodelist.add(new Node(1,2,67));
	nodelist.add(new Node(1,3,17));
	nodelist.add(new Node(2,4,24));
	nodelist.add(new Node(2,5,62));
	nodelist.add(new Node(3,5,20));
	nodelist.add(new Node(3,6,37));
	nodelist.add(new Node(4,7,13));
	nodelist.add(new Node(5,7,73));
	nodelist.add(new Node(5,6,45));
	
 }
}
