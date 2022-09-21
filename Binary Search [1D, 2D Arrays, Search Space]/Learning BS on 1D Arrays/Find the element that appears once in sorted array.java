class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int i=0,m=n-1;
        while(i<m){
            int mid=i+(m-i)/2;
            if((mid%2==0 && arr[mid]==arr[mid+1]) || (mid%2!=0 && arr[mid]==arr[mid-1])){
                i=mid+1;
            }else{
                m=mid;
            }
        }
        return arr[i];
    }
}
