class Solution {
    // long print(long n){
    //     if(n==1){
    //         return 1;
    //     }
    //     return (n*n*n+print(n-1));
    // }
    // long sumOfSeries(long N) {
    //     // code here
    //     return print(N);
    // }
    
    long sumOfSeries(long N) {
        // code here
        return (((N*N)*(N+1)*(N+1))/4);
    }
}
