class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> find(ArrayList<Integer> ans, Node root){
        if(root==null){
            return ans;
        }
        
        ans.add(root.data);
        find(ans, root.left);
        find(ans, root.right);
        
        return ans;
    }
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ans = new ArrayList<>();
        find(ans,root);
        
        return ans;
        
    }

}
