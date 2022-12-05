class Solution {
    
    public Node reverse(Node odd){
        Node pre = null, temp = odd;
        
        while(temp!=null){
            Node nxt = temp.next;
            temp.next = pre;
            pre = temp;
            temp = nxt;
            
        }
        odd = pre;
        return odd;
    }
    
    public Node merge(Node evn, Node odd){
        Node node = new Node(-1);
        Node temp = node;
        
        while(evn!=null && odd!=null){
            if(evn.data<=odd.data){
                temp.next = evn;
                evn = evn.next;
            }
            else{
                temp.next = odd;
                odd = odd.next;
            }
            temp = temp.next;
        }
        
        while(evn!=null){
            temp.next = evn; 
            evn = evn.next;
            temp = temp.next;
        }
        
         while(odd!=null){
            temp.next = odd; 
            odd = odd.next;
            temp = temp.next;
        }
        return node.next;
    }
    
    public Node sort(Node head){
        //your code here, return the head of the sorted list
        
        if(head==null || head.next==null){
            return head;
        }
        
        Node evn = head;
        Node odd = head.next;
        Node odd_Head = head.next;
        
        while(odd!=null && odd.next!=null){
            evn.next = evn.next.next;
            evn = evn.next;
            
            odd.next = odd.next.next;
            odd = odd.next;
        }
        evn.next = null;
        
        
        Node rev_odd = reverse(odd_Head);
        
        return merge(head, rev_odd);
    }


}
