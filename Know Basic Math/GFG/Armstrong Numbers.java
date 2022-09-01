//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int org=n;
        int dig = 0,num=n;
        int sum=0;
        while(org!=0){
            org/=10;
            dig++;
        }
        while(n!=0){
            int f = n%10;
            sum+=Math.pow(f,dig);
            n/=10;
        }
        if(num==sum){return "Yes";}
        else{
            return "No";
        }
    }
}
