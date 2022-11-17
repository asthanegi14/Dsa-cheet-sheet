class Solution
{
    //Function to check whether the list is palindrome.
    Node findMid(Node head){
        if(head==null){
            return head;
        }
        Node a = head;
        Node b = head;
        
        while(b.next!=null && b.next.next!=null){
            a = a.next;
            b=b.next.next;
        }
        return a;
    }
    Node reverse(Node head){
        if(head==null){
            return head;
        }
        Node a = head;
        Node pre = null;
        Node b = a.next;
        
        while(a!=null){
            a.next = pre;
            pre = a;
            a = b;
            
            if(b!=null){
                b=b.next;
            }
        }
        return pre;
    }
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node mid = findMid(head);
        Node last = reverse(mid.next);
        
        Node curr = head;
        while(last!=null){
            if(last.data!=curr.data){
                return false;
            }
            curr = curr.next;
            last = last.next;
        }
        return true;
    }    
}

