class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] ans = new int[2];
        
        int xor1=arr[0];
        for(int i=1;i<n;i++){
            xor1=xor1^arr[i];
        }
        for(int i=1;i<=n;i++){
            xor1=xor1^i;
        }
        
        int msb=xor1 & ~(xor1-1);
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if((arr[i]&msb) != 0){
                x=x^arr[i];
            }
            else{
                y=y^arr[i];
            }
        }
        
        for(int i=1;i<=n;i++){
            if((i&msb) != 0){
                x=x^i;
            }
            else{
                y=y^i;
            }
        }
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                ans[0]=x;
                ans[1]=y;
                break;
            }
            if(y==arr[i]){
                ans[0]=y;
                ans[1]=x;
                break;
            }
        }
        return ans;
    }
}
