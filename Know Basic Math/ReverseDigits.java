class Solution
{
    public long reverse_digit(long n)
    {
        // Code here
        long ans=0,m=0;
        while(n!=0){
            m=n%10;
            ans = ans*10+m;
            n/=10;
        }
        return ans;
    }
}
