class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=Integer.MIN_VALUE,x=0;
        for(int i=0;i<arr.length;i++){
            x+=arr[i];
            
            if(sum<x){
                sum=x;
            }
            if(x<0){
                x=0;
            }
        }
        return sum;
    }
    
}
