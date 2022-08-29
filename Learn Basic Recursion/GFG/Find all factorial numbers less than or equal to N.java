class Solution{
    static long find(int n){
        if(n==1){
            return 1;
        }
        return n*find(n-1);
    }
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> a = new ArrayList<Long>(); 
        long pro=1,m=0;
        for(int i=1;i<=N;i++){
            if(find(i)>N){
                return a;
            }
            a.add(find(i));
        }
        return a;
    }
}
