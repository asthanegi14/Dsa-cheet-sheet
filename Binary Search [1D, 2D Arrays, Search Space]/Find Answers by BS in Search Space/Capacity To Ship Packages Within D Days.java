class Solution {
    static boolean isValid(int[] a, int m, int d){
        int day=1;int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>m){
                day++;
                sum=a[i];
            }
            if(day>d){
                return false;
            }
        }
        return true;
    }
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int lo=0,hi=0,ans=-1;
        for(int i:arr){
            hi+=i;
            lo=Math.max(lo,i);
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isValid(arr,mid,D)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
};
