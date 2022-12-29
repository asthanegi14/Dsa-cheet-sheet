class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    Queue<Node> q = new LinkedList<>();
	    ArrayList<Integer> arr = new ArrayList<>();
	    q.add(root);
	    boolean b = true;
	    
	    while(!q.isEmpty()){
	        int size = q.size();
	        LinkedList<Integer> a2 = new LinkedList<>();
	        
	        while(size-->0){
	            Node num = q.poll();
	            if(b){
	                a2.add(num.data);
	            }
	            else{
	                a2.addFirst(num.data);
	            }
	            
	            if(num.left!=null){
	                q.add(num.left);
	            }
	            if(num.right!=null){
	                q.add(num.right);
	            }
	        }
	        
	        b = !b;
	        for(int i=0;i<a2.size();i++){
	            arr.add(a2.get(i));
	        }
	    }
	    return arr;
	    
	}
}
