/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/

class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head, int pos, int data)
	{
		// Your code here
		int count=0;
		Node toAdd = new Node(data);//node to insert
		
		if(head==null){
		    head = toAdd;
		    return;
		}
		
		Node temp=head;
		
		while(count!=pos){
		    temp = temp.next; 
		    count++;
		}
		toAdd.next = temp.next;
		toAdd.prev = temp;
		temp.next = toAdd;
		return;
		
	}
}
