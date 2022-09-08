class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> r,p=null;
        
        for(int i=0;i<n;i++){
            r=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    r.add(1l);
                }
                else{
                    r.add((p.get(j-1)+p.get(j))%1000000007);
                }
            }
            p=r;
            ans.add(r);
        }
        return ans.get(n-1);
    }
}
