class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int rev=0,m=0,num=n;
        while(n!=0){
            m=n%10;
            rev = rev*10+m;
            n/=10;
        }
        if(rev==num){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
