class Solution {
    int find(Node root, int[] a){
        
        if(root==null){
            return 0;
        }
        
        int l = find(root.left,a);
        int r = find(root.right,a);
        a[0] = Math.max(a[0],l+r);
        
        return 1+Math.max(l,r);
        
    }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        int[] a = new int[1];
        
        find(root,a);
        
        return a[0]+1;
    }
}
