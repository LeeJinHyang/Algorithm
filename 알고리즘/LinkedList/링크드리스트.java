
public class 링크드리스트 {
	static class Node{
		int data;
		Node link;
	}
	public static void main(String[] args) {
		Node head = new Node();
		head.data = 10;
		Node n2 = new Node();
		n2.data = 20;
		head.link = n2;
		Node n3 = new Node();
		n3.data = 30;
		n2.link = n3;
		Node n4 = new Node();
		n4.data = 40;
		n3.link = n4;
		n2 = n3 = n4 = null; //버려버려
		//마지막 놈을 출력해보시오
//		System.out.println(n1.link.link.link.data);
		Node n5 = new Node();
		n5.data = 50;
		//n5를 우리의 링크드리스트 맨 마지막에 추가하시오
		Node tmp = head;
		while( tmp.link != null )
			tmp = tmp.link;
		tmp.link = n5;
		n5 = null;
		
		Node n6 = new Node();
		n6.data = 60;
		//n6를 맨 처음으로 끼어 넣으시오ㅋ
		//head를 n6의 link로 연결
		//n6를 head에 기억
		n6.link = head;
		head = n6;
		
		//head부터 모든 원소를 출력해보시오
		tmp = head;
		while( tmp != null ) {
			System.out.println(tmp.data);
			tmp = tmp.link;
		}
		
	}
}










