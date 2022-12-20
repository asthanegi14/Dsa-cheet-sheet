class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> find(ArrayList<Integer> ans, Node root){
        if(root==null){
            return ans;
        }
        
        find(ans,root.left);
        ans.add(root.data);
        find(ans,root.right);
        
        return ans;
        
    }
    
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        
        find(ans,root);
        
        return ans;
    }
}
