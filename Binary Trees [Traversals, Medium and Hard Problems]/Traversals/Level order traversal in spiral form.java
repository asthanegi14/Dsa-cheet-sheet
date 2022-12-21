class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root==null){
            return ans;
        }
        boolean b = false;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            
            LinkedList<Integer> arr = new LinkedList<>();
            while(size-->0){
                Node num = q.poll();
                
                if(b){
                    arr.add(num.data);
                }
                else{
                    arr.addFirst(num.data);
                }
                  
                if(num.left!=null){
                    q.add(num.left);
                }
                if(num.right!=null){
                    q.add(num.right);
                }
                
            }
            for(int i=0;i<arr.size();i++){
                ans.add(arr.get(i));
            }
            b=!b;
        }
        
        return ans;
    }
}
