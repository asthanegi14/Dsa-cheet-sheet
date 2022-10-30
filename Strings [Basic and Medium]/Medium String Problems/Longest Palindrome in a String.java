class Solution{
    static String findPalindrome(String s, int i, int n){
        while(i>=0 && n<s.length() && s.charAt(i)==s.charAt(n)){
            i--;
            n++;
        }
        return s.substring(i+1,n);
    }
    static String longestPalin(String S){
        // code here
        String temp = "";
        for(int i=0;i<S.length();i++){
            String ret = findPalindrome(S,i,i);
            
            if(ret.length()>temp.length()){
                temp=ret;
            }
            
            ret=findPalindrome(S,i,i+1);
            if(ret.length()>temp.length()){
                temp=ret;
            }
        }
        return temp;
    }
}
