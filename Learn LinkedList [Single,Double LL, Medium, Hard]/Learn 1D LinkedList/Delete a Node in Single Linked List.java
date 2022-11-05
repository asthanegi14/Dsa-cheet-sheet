class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	    while(!(head.data==x)){
	        head = head.next;
	    }
	    head.data=head.next.data;
	    head.next=head.next.next;
	    return head;
    }
}
