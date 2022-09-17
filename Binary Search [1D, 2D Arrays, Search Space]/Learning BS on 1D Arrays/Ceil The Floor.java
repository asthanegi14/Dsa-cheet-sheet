class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        //TC: O(n(lon(n)))
        // Arrays.sort(arr);
        // int lo=-1,up=-1;
        // int i=0,hi=n-1;
        // while(i<=hi){
        //     int mid=(i+(n-i))/2;
        //     if(arr[mid]==x){
        //         lo=x;
        //         up=x;
        //         return new Pair(lo,up);
        //     }
        //     else if(arr[mid]<x){
        //         lo=arr[mid];
        //         i=mid+1;
        //     }
        //     else{
        //         up=arr[mid];
        //         hi=mid-1;
        //     }
        // }
        // return new Pair(lo,up);
        
        //TC: O(n)
        int lo=-1,up=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                lo=Math.max(lo,arr[i]);
            }
            if(arr[i]>=x){
                if(up==-1){
                    up=arr[i];
                }
                else
                up=Math.min(up,arr[i]);
            }
        }
        return new Pair(lo,up);
    }
}

