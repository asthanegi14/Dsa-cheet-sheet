class Solution {
    static int countNodes(int i) {
        // code here
        
        if(i==1){
            return 1;
        }
        
        return (int)Math.pow(2,i-1);
    }
}
