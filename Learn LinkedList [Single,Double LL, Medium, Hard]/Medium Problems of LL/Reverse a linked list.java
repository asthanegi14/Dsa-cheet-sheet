class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null){
            return head;
        }
        Node curr=head;
        Node prev = null;
        Node nxt = curr.next;
        
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr= nxt;
            
            if(nxt!=null){
                nxt=nxt.next;
            }
        }
        
        return prev;
    }
}
