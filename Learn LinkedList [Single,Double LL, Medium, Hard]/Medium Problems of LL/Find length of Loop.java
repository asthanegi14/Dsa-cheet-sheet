class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        if(head==null || head.next==null){
            return 0;
        }
        int count=1;
        
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast == slow){
                break;
            }
        }
        
        if(slow!=fast){
            return 0;
        }
        
        while(slow.next!=fast){
            slow=slow.next;
            count++;
        }
        return count;
    }
}
