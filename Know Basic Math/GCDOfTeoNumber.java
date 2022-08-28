//tc : O(n)

class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(A==B){
            return A;
        }
        int ans=0;
        int min = Math.min(A,B);
        for(int i=1;i<=min;i++){
            if(A%i==0 && B%i==0){
                ans = i;
            }
        }
        return ans;
    } 
}

//Tc: O(log(min(A,B))

class Solution
{
    public int gcd(int A , int B) 
    { 
        //code here
        if(B==0){
            return A;
        }
        return gcd(B,A%B);
    } 
}
