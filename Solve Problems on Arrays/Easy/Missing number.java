class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         int xor=0;
         for(int i=0;i<A.length;i++){
             xor=xor^A[i];
         }
         for(int i=1;i<=N;i++){
             xor=xor^i;
         }
         return xor;
    }
}
