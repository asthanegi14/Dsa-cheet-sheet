class Solution {
    public static int longestOnes(int n, int[] nums, int k) {
        // code here
        int i=0,j=0,count=0,ans=0;
        
        while(j<n){
            if(nums[j]==0){
                count++;
            }
            while(count>k){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
       
