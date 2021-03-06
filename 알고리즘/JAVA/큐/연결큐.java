
class MyLinkedQueue{
	static class Node{
		int data;
		Node link;
	}
	Node front;
	Node rear;
	void enQueue(int data) {
		Node node = new Node();
		node.data = data;
		if( front == null ) {
			front = node;
			rear = node;
		}
		else {
			//현재 rear의 다음에 node를 연결하고 rear가 node를 바라보자.
			rear.link = node;
			rear = node;
		}
	}
	int deQueue() {
		if( front != null ) {
			int res = front.data;
			front = front.link;
			if( front == null )
				rear = null;
			return res;
		}
		else {
			return -1;
		}
	}
}
public class 연결큐 {
	public static void main(String[] args) {
		MyLinkedQueue queue = new MyLinkedQueue();
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}





