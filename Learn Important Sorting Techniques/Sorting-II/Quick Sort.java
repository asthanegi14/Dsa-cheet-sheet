class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int a[], int low, int high)
    {
        // code here
       if(low<high){
            int piv = partition(a,low,high);
            quickSort(a,low,piv-1);
            quickSort(a,piv+1,high);
        }
    }
    static int partition(int a[], int low, int high)
    {
        // your code here
        
        int i=low;
        int j=high;
        int p=a[low];
        
        while(i<j){
            while(a[i]<=p && i<=high-1){
                i++;
            }
            while(a[j]>p && j>=0){
                j--;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp = a[j];
        a[j] = a[low];
        a[low] = temp;
        return j;
    } 
}
