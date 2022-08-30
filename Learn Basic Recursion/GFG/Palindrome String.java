class Solution {
    boolean check(String S, int i, int n){
        if(i<=n){
             char a = S.charAt(i);
            char b = S.charAt(n);
                if(a!=b){
                    return false;
                }
            return check(S,i+1,n-1);
        }
       return true;
    }
    int isPalindrome(String S) {
        // code here
        
        if(!check(S,0,S.length()-1)){
            return 0;
        }
        return 1;
    }
}
