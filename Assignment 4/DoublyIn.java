public class DoublyIn{
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
		System.out.println();
		while(r!=null){
			System.out.print(r.data+" <== ");
			r = r.prev;
		}
	}
	public void deleteHead(){
		if(head == null){
			return;
		}
		head = head.next;
		if(head != null){
			head.prev = null;
		}
		
	}
	public void deleteLast(){
		
	}
	public static void main(String args[]){
		DoublyIn list = new DoublyIn();
		list.insertData(21);
		list.insertData(30);
		list.insertData(12);
		list.insertData(201);
		list.insertData(2001);
		list.insertData(102);
		list.printData();
	}
}