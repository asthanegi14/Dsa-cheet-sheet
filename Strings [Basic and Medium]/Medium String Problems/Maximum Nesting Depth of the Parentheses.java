class Solution {
    public int maxDepth(String s) {
        int max=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
                max=Math.max(max,count);
            }
            if(s.charAt(i)==')'){
                count--;
            }
        }
        return max;
    }
}
