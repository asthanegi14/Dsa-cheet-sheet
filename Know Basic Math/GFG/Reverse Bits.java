class Solution {
    static Long reversedBits(Long X) {
        // code here 
        long res = 0;
        for(int i=0;i<32;i++){
            res=res<<1;
            if((X&1)==1){
                res++;
            }
            X=X>>1;
        }
        return res;
    }
}
