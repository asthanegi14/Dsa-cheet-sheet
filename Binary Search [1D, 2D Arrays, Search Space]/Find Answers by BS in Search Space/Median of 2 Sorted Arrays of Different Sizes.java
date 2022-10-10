class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int[] ans = new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            ans[k]=a[i];
            k++;
        }
        
        for(int i=0;i<m;i++){
            ans[k]=b[i];
            k++;
        }
        Arrays.sort(ans);
        
        double ret=0.0;
        
        int mid=ans.length/2;
        int oddeven = ans.length%2;
        
        if(oddeven==0){
            ret=(ans[mid]+ans[mid-1])/2.0;
        }
        else{
            ret=ans[mid];
        }
        return ret;
    }
}
