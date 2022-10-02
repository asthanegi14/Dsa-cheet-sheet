class Solution {
    public static boolean possible(int spd, int[] piles, int h){
        long t=0;
        for(int i=0;i<piles.length;i++){
            t += piles[i]/spd ;
            if(piles[i]%spd!=0){
                t++;
            }
        }
        return t<=h;
    }
    public static int Solve(int N, int[] piles, int H) {
        // code here
        Arrays.sort(piles);
        int i=1,n=piles[N-1];
        while(i<n){
            int mid=i+(n-i)/2;
            if(possible(mid,piles,H)){
                n=mid;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
