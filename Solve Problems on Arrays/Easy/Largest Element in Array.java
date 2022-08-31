class Compute {
    
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
