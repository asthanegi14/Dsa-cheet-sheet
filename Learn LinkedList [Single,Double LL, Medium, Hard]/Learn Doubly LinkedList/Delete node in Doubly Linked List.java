/* Structure of linkedlist node
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
    	if(head==null){
    	    return head;
    	}
    	if(x==1){
    	    head = head.next;
    	    return head;
    	}
    	int count=1;
    	Node temp = head;
    	
	    while(count!=x){
	        temp=temp.next;
	        count++;
	    }
	    temp.prev.next = temp.next;
	    if(temp.next==null){
	        return head;
	    }
	    else
	        temp.next.prev = temp.prev;
	   return head;
    }
}
