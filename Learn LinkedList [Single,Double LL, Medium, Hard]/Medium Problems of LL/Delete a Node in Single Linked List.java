class GfG
{
    Node deleteNode(Node head, int x)
    {
    	// Your code here	
    	if(head==null){
    	    return head;
    	}
    	if(x==1){
    	    head = head.next;
    	    return head;
    	}
    	Node a = head;
	    int count=1;
	    while(x-1>count && a!=null){
	        a = a.next;
	        count++;
	    }
	    if(a==null){
	        return head;
	    }
	    a.next = a.next.next;
	    return head;
    }
}
