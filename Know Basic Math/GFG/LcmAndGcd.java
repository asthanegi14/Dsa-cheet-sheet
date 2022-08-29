class Solution {
    static long findGcd(long a, long b){
        if(b==0){
            return a;
        }
        return findGcd(b,a%b);
    }
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        
        long g = findGcd(A,B);
        // System.out.println("g = "+g);
        long l = (A*B)/g;
        // System.out.println("l = "+l);
        return new Long[]{l,g};
    }
};
