public class Count{
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(){
		}
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	public void insertData(int d){
		Node new_node = new Node(d);
		new_node.next = head;
		new_node.prev = null;
		if(head!=null)
			head.prev = new_node;
		head = new_node;
		return;
	}
	public void printData(){
		Node temp = head;
		Node r = null;
		while(temp!=null){
			System.out.print(temp.data+" --> ");
			r = temp;
			temp = temp.next;
		}
	}
	public int length() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
		count++;
		temp = temp.next;
		}
		return count;
		}
	public static void main(String args[]){
		Count list = new Count();
		list.insertData(21);
		list.insertData(30);
		list.insertData(12);
		list.insertData(201);
		list.insertData(2001);
		list.insertData(102);
		list.printData();
		System.out.println();
		System.out.println("Length of LinkedList : "+list.length());
	}
}