class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here
            int j=0;
            for(int i=0;i<n;i++){
                if(arr1[i]>arr2[0]){
                    long temp=arr1[i];
                    arr1[i]=arr2[0];
                    arr2[0]=temp;
                }
            long sml=arr2[0];
            
            for(j=1;j<m && arr2[j]<sml;j++){
                arr2[j-1]=arr2[j];
            }
            arr2[j-1]=sml;
            }
            
    }
}
