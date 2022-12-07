class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        Node a = head1;
        Node b = head2;
        
        while(b!=null){
            map.put(b.data,0);
            b=b.next;
        }
        
        while(a!=null){
            if(map.containsKey(a.data)){
                arr.add(a.data);
            }
            a=a.next;
        }
        
        Node n = new Node(-1);
        Node nxt = n;
        
        for(int i=0;i<arr.size();i++){
            nxt.next = new Node(arr.get(i));
            nxt = nxt.next;
        }
        return n.next;
    }
}
