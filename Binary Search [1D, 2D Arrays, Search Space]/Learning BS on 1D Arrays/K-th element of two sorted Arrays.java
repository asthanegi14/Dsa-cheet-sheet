class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int x1=0,x2=0,count=0;
        
        while(x1<n && x2<m){
            if(arr1[x1]<arr2[x2]){
                count++;
                if(count==k){return arr1[x1];}
                // ans=arr1[x1];
                x1++;
            }
            else{
                count++;
                if(count==k){return arr2[x2];}
                // ans=arr2[x2];
                x2++;
            }
        }
        if(count!=k){
            while(x1<n){
                count++;
                if(count==k){return arr1[x1];}
                // ans=arr1[x1];
                x1++;
            }
            while(x2<m){
                count++;
                if(count==k){return arr2[x2];}
                // ans=arr2[x2];
                x2++;
            }
        }
        return -1;
    }
}
