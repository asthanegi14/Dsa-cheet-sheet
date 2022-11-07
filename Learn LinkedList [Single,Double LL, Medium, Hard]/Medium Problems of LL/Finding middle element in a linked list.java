class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         int count=0;
         Node temp=head;
         while(temp!=null){
             temp = temp.next;
             count++;
         }
         
         int mid = count/2;
         while(mid>0){
             head=head.next;
             mid--;
         }
         return head.data;
    }
}
