class Solution{
    static int evenlyDivides(int n){
        // code here
        int m =0,count=0,org=n,num=n;
        int ans = 0;
        while(Math.sqrt(org)!=0){
            m=org%10;
            if(m!=0 && num%m==0){
                ans += 1;
            }
            org/=10;
        }
        return ans;
    }
}

//Tc: O(log(n))
//Sc:O(1)
