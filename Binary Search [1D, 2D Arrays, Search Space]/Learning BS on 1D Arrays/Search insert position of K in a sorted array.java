class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int i=0,n=N-1;
        int lo=-1,up=-1;
        while(i<=n){
            int mid = i+(n-i)/2;
            if(Arr[mid]==k){
                return mid;
            }
            if(Arr[mid]<k){
                i=mid+1;
                lo=mid;
            }
            else{
                n=mid-1;
                up=mid;
            }
        }
        if(lo==N-1 && Arr[lo]<k ){
            return lo+1;
        }
        if(up==0 && Arr[up]>k){
            return 0;
        }
        return Math.max(lo,up);
    }
}
