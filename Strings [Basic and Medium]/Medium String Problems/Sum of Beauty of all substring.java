class Solution {
    public static int findBeauty(int[] a){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                min = Math.min(min,a[i]);
                max = Math.max(max,a[i]);
            }
        }
        return max-min;
    }
    public static int beautySum(String s) {
        // code here
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] a = new int[26];
            for(int j=i;j<s.length();j++){
                a[s.charAt(j)-'a']++;
                sum+=findBeauty(a);
            }
        }
        return sum;
    }
}
