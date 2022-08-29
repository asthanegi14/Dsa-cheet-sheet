class Solution{
    
    //Tc:O(N*N)
    
    
    // static long div(int j){
    //     long sum=0;
    //     for(int i=1;i<=j;i++){
    //         if(j%i==0){
    //           sum+=i;
    //         }
    //     }
    //     // System.out.println("sum="+sum);
    //     return sum;
    // } 
    // static long sumOfDivisors(int N){
    //     // code here
    //     long sum=0;
    //     for(int i=1;i<=N;i++){
    //         sum+=div(i);
    //     }
    //     return sum;
    // }
    
    //Tc: O(N)
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++){
            sum+=(N/i)*i;
        }
        return sum;
    }
}
