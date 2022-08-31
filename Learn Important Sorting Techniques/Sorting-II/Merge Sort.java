class Solution
{
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         
         int[] ans = new int[r-l+1];
   
        int i=l;
        int j=m+1;
        int x=0;
   
        while(i<=m && j<=r){
           if(arr[i]<=arr[j]){
               ans[x++]=arr[i++];}
           
           else{
               ans[x++]=arr[j++];}
           
          }
     
     while(i<=m){
         ans[x++]=arr[i++];}
        
     while(j<=r){
        ans[x++]=arr[j++];}
     
      
      for(int k=0,y=l;k<ans.length;k++,y++){
          arr[y]=ans[k];
         }
    }
}
