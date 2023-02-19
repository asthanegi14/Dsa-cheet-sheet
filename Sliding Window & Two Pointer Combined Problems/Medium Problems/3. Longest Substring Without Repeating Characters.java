class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0,j=0;
        int ans=0;

        while(i<s.length() && j<s.length()){
            char c = s.charAt(j);
            if(!map.containsKey(c)){
                map.put(c,1);
                ans = Math.max(ans, map.size());
            }
            else{
                i++;
                j=i-1;
                ans = Math.max(ans, map.size());
                map.clear();
            }
            ans = Math.max(ans, map.size());
            j++;
        }
        return ans;
    }
}
