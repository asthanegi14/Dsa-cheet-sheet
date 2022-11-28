
class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	if(head==null){
    	    return 0;
    	}
    	Node temp = head;	
    	Node nxt = temp.next;
    	Node prev = null;
    	
    	while(temp!=null){
    	    temp.next=prev;
    	    prev = temp;
    	    temp = nxt;
    	    
    	    if(nxt != null){
    	        nxt = nxt.next;
    	    }
    	}
    	int count=0,ans=-1;
    	while(count!=n-1  && prev!=null){
    	   prev = prev.next;
    	   count++;
    	}
    	if(prev!=null){
    	    ans = prev.data;
    	}   
    	else{
    	    ans = -1;
    	}
    	return ans;
    }
}
