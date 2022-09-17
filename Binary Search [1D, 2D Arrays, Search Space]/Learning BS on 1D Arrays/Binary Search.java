class Solution {
    int binary(int lo, int hi, int[] a, int k){
        int ans=-1;
        for(int i=lo;i<hi;i++){
            if(a[i]==k){
                ans = i;  
                break;
            }
        }
        return ans;
    }
    int binarysearch(int arr[], int n, int k) {
        // code here
        int i=0;
        int mid=(i+n)/2;
        int ans = -1;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]<k){
            ans=binary(mid+1,n,arr,k);
        }
        else
            ans=binary(i,mid,arr,k);
        return ans;
    }
}
