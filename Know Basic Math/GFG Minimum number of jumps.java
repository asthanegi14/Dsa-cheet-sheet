class Solution{
    static int minJumps(int[] arr){
        // your code here
        int count=1;
        int j=arr[0];
        int max=arr[0];
        if(arr.length==1){
            return 0;
        }
        else if(arr[0]==0){return -1;}
        else{
            for(int i=1;i<arr.length;i++){
                if(i==arr.length-1){
                    return count;
                }
                max = Math.max(max,i+arr[i]);
                j--;
                if(j==0){
                    count++;
                    if(i>=max){
                        return -1;
                    }
                    j=max-i;
                }
            }
        }
        return count;
    }
}
