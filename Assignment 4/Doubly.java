public class Doubly{
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			this.data = d;
			next = null;
			prev = null;
		}
	}
	public void insertData(int d){
		Node new_node = new Node(d);
		if(head == null){
			new_node.next = null;
			new_node.prev = null;
			head = new_node;
			return;
		}
		new_node.prev = null;
		new_node.next = head;
		head.prev = new_node;
		head = new_node;
	}
	public void insertLast(int d){
		Node temp = head;
		Node new_node = new Node(d);
		if(head==null){
			head.next = null;
			head.prev = null;
			head = new_node;
			return;
		}
		while(temp.next != null){
			temp = temp.next;
		}
		new_node.next = null;
		new_node.prev = temp;
		temp.next = new_node;
		
	}
	public void insertBetween(Node n,int d){
		Node new_node = new Node(d);
		Node temp = n;
		//for(int i=0;i<pos;i++)
		//	temp = temp.next;
		new_node.next = n.next;
		new_node.prev = n;
		n.next.prev = new_node;
		n.next = new_node;
	}
	public void insertPosition(int pos,int d){
		Node n = head;
		int i = 0;
		while(n!=null){
			if(pos==i){
				Node new_node = new Node(d);
				new_node.next = n.next;
				new_node.prev = n;
				n.next.prev = new_node;
				n.next = new_node;
				return;
			}
			else{
				n=n.next;
				i++;
			}
		}		
	}
	public void deleteFirst(){
		if(head!=null){
		head = head.next;
		head.prev = null;
		return;
		}
	}
	public void deleteAfterKey(int key){
		Node n = head;
		while(n!=null){
			if(n.data==key){
				n.prev.next = n.next;
				n.next.prev = n.prev;
				
				return;
			}
			else{
				n=n.next;
			}
		}		
	}
	public void insertAfterKey(int key,int d){
		Node n = head;
		while(n!=null){
			if(n.data==key){
				Node new_node = new Node(d);
				new_node.next = n.next;
				new_node.prev = n;
				n.next = new_node;
				if(new_node.next!=null){
					new_node.next.prev = new_node;
					//n.next.prev = new_node;
				}
				return;
			}
			else{
				n=n.next;
			}
		}		
	}
	public void display(){
		Node rev = null;
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+"-->");
			rev = temp;
			temp = temp.next;
		}
		System.out.println();
		while(rev!=null){
			System.out.print("<--"+rev.data);
			rev = rev.prev;
		}
	}
	public static void main(String args[]){
		Doubly d = new Doubly();
		d.insertData(60);
		d.insertData(50);
		d.insertData(40);
		d.insertData(30);
		d.insertData(20);
		d.insertData(10);
		//d.display();
		d.insertLast(2001);
		//System.out.println();
		//d.display();
		//d.insertBetween(d.head.next.next,35);
		System.out.println();
		//d.display();
		d.insertPosition(4,50000);
		//d.display();
		d.insertAfterKey(30,21000);
		System.out.println();
		System.out.println();
		//d.display();
		//d.deleteFirst();
		System.out.println();
		//d.display();
		d.insertBetween(d.head.next.next,9);
		System.out.println();
		d.display();
		d.deleteAfterKey(20);
		System.out.println();
		d.display();
	}
}