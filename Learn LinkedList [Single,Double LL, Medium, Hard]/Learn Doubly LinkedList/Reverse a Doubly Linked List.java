public static Node reverseDLL(Node  head)
{
    //Your code here
    if(head==null){
        return head;
    }
    Node curr = head;
    
    while(curr!=null){
        Node temp = curr.next;
        curr.next = curr.prev;
        curr.prev = temp;
        head = curr;
        
        if(curr.next==null){
            head = curr;
        }
        
        curr = curr.prev;
    }
    return head;
}
