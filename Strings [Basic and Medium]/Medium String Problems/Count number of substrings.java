class Solution
{
    long ret(String s, int k){
        int i=0,j=0;
        int[] a = new int[26];
        long count=0;
        int size=0;
        while(j<s.length()){
            if(a[s.charAt(j)-'a']==0){
                size++;
            }
            a[s.charAt(j)-'a']++;
            while(size>k){
                a[s.charAt(i)-'a']--;
                if(a[s.charAt(i)-'a']==0){
                    size--;
                }
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
    long substrCount (String s, int k) {
        // your code here
        return ret(s,k)-ret(s,k-1);
    }
}
