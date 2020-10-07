
public class SinglyLinkedList {
	static class Node{
		int data;
		Node link;
	}
	Node head;
	int size;
	
	void enqueue(int data) {
		//새로운 데이터를 추가한다.
		Node node = new Node();
		node.data = data;
		if( head == null )
			head = node;
		//맨앞에부터 나보다 작은 경우
		else if ( head.data > node.data ) {
			node.link = head;
			head = node;
		}
		//처음으로 나보다 커지는놈이 발견되면 그 앞에 들어갈거야.
		else {
			Node pre = head;
			Node tmp = head.link;
			while( tmp != null && tmp.data < node.data ) {
				pre = pre.link;
				tmp = tmp.link;
			}
			node.link = tmp;
			pre.link = node;
		}
	}
	
	
	void addToFirst(int data) {
		Node node = new Node();
		node.data = data;
		size++;
		if( head == null )
			head = node;
		else {
			//새로만든애의 다음을 현재의 head로 잡고, 새로만든애를 head가 가리키게 만들면됨ㅇㅇ
			node.link = head; 
			head = node;
		}
	}
	void addToLast(int data) {
		Node node = new Node();
		node.data = data;
		size++;
		if( head == null )
			head = node;
		else {
			Node tmp = head;
			while( tmp.link != null )
				tmp = tmp.link;
			tmp.link = node;
		}
	}
	//전체 노드들을 이쁘게 쭑 문자열로 만들어주도록
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node tmp = head;
		while( tmp != null ) {
			sb.append(tmp.data).append(" ");
			tmp = tmp.link;
		}
		return sb.toString();
	}
	Node get(int idx) {
		//ㄱ
		if( idx >= size || idx < 0 )
			return null;
		Node tmp = head;
		for(int i = 0; i < idx; i++)
			tmp = tmp.link;
		return tmp;
	}
	void add(int idx, int data) {
		//idx보다 하나 앞에놈을 찾아와서
		//그놈의 link의 값을 새로만든놈의 link로 저장
		//나를 그놈의 link로 저장
		//잘못된 인덱스. 만약 리스트에 원소가 4개 있다면, 0은 맨앞에 넣고싶은거고, 4는 맨 뒤에 넣고 싶은거고, 1은 0번뒤에.
		if( idx > size || idx < 0 )
			return;
		if( idx == 0 )
			addToFirst(data);
		else if (idx == size)
			addToLast(data);
		else {
			//둘다 아닌 경우는 내 앞에놈 찾아와서, 새로운 노드객체 생성하고 data저장하고, 찾은놈 뒤에 붙자
			Node node = new Node();
			node.data = data;
			size++;
			Node pre = get(idx-1);
			node.link = pre.link;
			pre.link = node;
		}
	}
	void delete(int idx) {
		if( size < 1 || size <= idx || idx < 0 )
			return;
		size--;
		//첫번째꺼를 지우는 경우는 나의 다음놈을 헤드에게 주면 됨
		if( idx == 0 ) {
			head = head.link;
		}
		else {
			Node pre = get(idx-1);
			Node target = pre.link;
			pre.link= target.link;
		}
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addToFirst(10);
		list.addToFirst(20);
		list.addToFirst(30);
		System.out.println(list);
	}
}




