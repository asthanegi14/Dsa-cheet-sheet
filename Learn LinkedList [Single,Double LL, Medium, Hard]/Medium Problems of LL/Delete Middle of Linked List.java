class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node a = head, b = head.next.next;
        while(b!=null && b.next!=null){
            b = b.next.next;
            a = a.next;
        }
        a.next = a.next.next;
        return head;
    }
}
