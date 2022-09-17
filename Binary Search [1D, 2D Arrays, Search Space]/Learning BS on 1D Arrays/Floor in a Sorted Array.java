class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int i=0,hi=n-1;
        int ans=-1;
        while(i<=hi){
            int mid=i+(hi-i)/2;
            if(arr[mid]<=x){
                ans=mid;
                i=mid+1;
            }
            else{
                hi=mid-1;
            }
        }   
        return ans;
    }
    
}
