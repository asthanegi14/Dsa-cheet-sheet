//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
class Solution
{
    //Tc : O(n*n)
    
    // void leftRotate(long arr[], int k,int n)
    // {
    //     while(k-->0){
            
    //     long temp = arr[0];
    //     for(int i=0;i<n-1;i++){
    //         arr[i] = arr[i+1];
    //     }
    //     arr[n-1] = temp;
    //     }
    // }
    
    void leftRotate(long arr[], int k,int n){
        k=k%n;
        int i=0,j=k-1; 
        while(i<j){
            long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;i++;
        }
        
        i=k;j=n-1;
        while(i<j){
             long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;i++;
        }
        i=0;j=n-1;
        while(i<j){
             long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;i++;
        }
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            ob.leftRotate(a,k,n);
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}
