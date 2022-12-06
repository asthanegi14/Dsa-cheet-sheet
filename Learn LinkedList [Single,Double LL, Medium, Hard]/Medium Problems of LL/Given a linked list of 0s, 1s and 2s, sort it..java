//Tc:O(n)
//Sc:O(n)

class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        
        while(temp!=null){
            arr.add(temp.data);
            temp = temp.next;
        }
        
        Collections.sort(arr);
        
        Node n = new Node(-1);
        Node tempN = n;
        
        for(int i=0;i<arr.size();i++){
            Node num = new Node(arr.get(i));
            tempN.next = num;
            tempN = tempN.next;
        }
        
        return n.next;
    }
}
