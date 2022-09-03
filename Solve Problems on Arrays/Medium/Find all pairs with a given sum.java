class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<pair> p = new ArrayList<>();
        HashSet<Long> ret = new HashSet<>();
        
        for(int i=0;i<M;i++){
            ret.add(B[i]);
        }
        Arrays.sort(A);
        
       for(int i=0;i<N;i++){
           if(ret.contains(X-A[i])){
               p.add(new pair(A[i],X-A[i]));
           }
       }
       return p.toArray(new pair[p.size()]);
    }
}
