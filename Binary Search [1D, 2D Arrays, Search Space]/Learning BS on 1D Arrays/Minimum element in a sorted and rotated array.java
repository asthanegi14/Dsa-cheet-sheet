class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int i=0,m=n-1,min=Integer.MAX_VALUE;
        while(i<=m){
            if(arr[i]<arr[m]){
                min=Math.min(min,arr[i]);
                break;
            }
            int mid=i+(m-i)/2;
            if(arr[mid]>=arr[i]){
                min=Math.min(min,arr[i]);
                i=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                m=mid-1;
            }
        }
        return min;
    }
}
