class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int i=0,m=n-1,count=0,min=Integer.MAX_VALUE;
        while(i<=m){
            if(arr[i]<arr[m]){
                return 0;
            }
            int mid=i+(m-i)/2;
            if(arr[i]<=arr[mid]){
                if(arr[i]<=min){
                    min=arr[i];
                    count=i;
                }
                i=mid+1;
            }
            else{
                if(arr[mid]<=min){
                    min=arr[mid];
                    count=mid;
                }
                m=mid-1;
            }
        }
        return count;
    }
}
