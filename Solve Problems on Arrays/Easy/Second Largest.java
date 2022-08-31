class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2 = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        return max2;
    }
}
