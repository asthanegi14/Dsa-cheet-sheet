class Solution {
    int find(int[] arr, int N,int k){
        int i=0,n=N-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                i=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        return -1;
    }
    int count(int[] arr, int n, int x) {
        // code here
        int indx = find(arr,n,x);
        
        if(indx==-1){
            return 0;
        }
        
        int count=1,left=indx-1;
        while(left>=0 && arr[left]==x){
            count++;
            left--;
        }
        
        int right=indx+1;
        while(right<n && arr[right]==x){
            count++;
            right++;
        }
        return count;
    }
}
