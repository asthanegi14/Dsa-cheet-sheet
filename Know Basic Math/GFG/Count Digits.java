//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


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
