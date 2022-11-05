class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        
        //Code here
        int count=0;
        if(head==null){
            return 0;
        }
        else{
            while(head!=null){
                count++;
                head=head.next;
            }
        }
        return count;
    }
}
