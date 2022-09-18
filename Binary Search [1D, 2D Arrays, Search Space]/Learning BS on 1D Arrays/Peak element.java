class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       int i=0,x=n-1;
       while(i<x){
           int mid = i+(x-i)/2;
           if(mid==0){
               return arr[0]>=arr[1]?0:1;
           }
           if(mid==n-1){
               return arr[n-1]>=arr[n-2]?(n-1):(n-2);
           }
           if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1]){
               return mid;
           }
           if(arr[mid]<arr[mid-1]){
               x=mid-1;
           }
           else{
               i=mid+1;
           }
       }
       return i;
    }
}
