class Tree
{
    boolean ans = true;
    //Function to check whether a binary tree is balanced or not.
    int find(Node root){
        if(root==null){
            return 0;
        }
        
        int l = find(root.left);
        int r = find(root.right);
        
        if(Math.abs(l-r)>1){
            ans = false;
        }
        return 1+Math.max(l,r);
    }
    boolean isBalanced(Node root)
    {
	// Your code here
	    int a = find(root);
	    return ans;
    }
}
