class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        //Using two Pointer or floyd warshall
        
        if(head == null || head.next == null){
            return false;
        }
        Node a = head;
        Node b = head;
        
        while(b!=null && b.next!=null){
            a=a.next;
            b=b.next.next;
            
            if(a==b){
                return true;
            }
        }
        return false;
    }
}
