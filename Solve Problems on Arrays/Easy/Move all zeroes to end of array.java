class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int k=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
                count++;
            }
        }
        for(int i=count;i<n;i++){
            arr[k++]=0;
        }
    }
}
