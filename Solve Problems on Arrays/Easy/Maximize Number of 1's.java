class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int count=0,ans=0;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
            while(count>m){
                j++;
                if(arr[j]==0){
                    count--;
                }
            }
            int x=i-j;
            if(x>ans){
                ans=x;
            }
        }
        return ans;
    }
}
