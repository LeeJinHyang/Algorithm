package 원하는변수로정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 원하는변수로정렬_comparator {
	static class Node{
		int x;
		int y;
		public Node(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        Node n1 = new Node(1,3);
        Node n2 = new Node(3,7);
        Node n3 = new Node(9,6);
        
        list.add(n1);
        list.add(n2);
        list.add(n3);
        //System.out.println(list);//원본
        for(Node node : list) {
        	System.out.println("x : "+ node.x+" y : "+node.y);
        }
        //Collections.sort(list,x);
        System.out.println("##########sort#########");
        System.out.println();//Comparable sort
        for(Node node : list) {
        	System.out.println("x : "+ node.x+" y : "+node.y);
        }
        //익명의 Comparator를 만듦
        Comparator<Node> salesComparator = new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.y - o1.y;
            }
        };
        Collections.sort(list,salesComparator);
        
        
        System.out.println("##########sort#########");
        //System.out.println(list);//Comparator sort
        for(Node node : list) {
        	System.out.println("x : "+ node.x+" y : "+node.y);
        }
    }
}

