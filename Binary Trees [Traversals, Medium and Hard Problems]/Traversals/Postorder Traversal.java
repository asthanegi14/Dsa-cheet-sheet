class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        
        find(ans,root);
        
        return ans;
    }
    ArrayList<Integer> find(ArrayList<Integer> ans, Node root){
        if(root==null){
            return ans;
        }
        
        find(ans,root.left);
        find(ans,root.right);
        ans.add(root.data);
        
        return ans;
        
    }
}
