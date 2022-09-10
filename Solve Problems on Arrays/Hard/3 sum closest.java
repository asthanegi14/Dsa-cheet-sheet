class Solution
{
    static int closest3Sum(int a[], int n, int x)
    {
        // code here
        Arrays.sort(a);
        int ans = a[0]+a[1]+a[2];
        
        for(int i=0;i<n-2;i++){
            int lo=i+1, hi=n-1;
                
            while(lo<hi){
                int sum=a[i]+a[lo]+a[hi];
                    
                if(sum==x){return sum;}
                else if(Math.abs(x-sum)<Math.abs(x-ans)){
                    ans=sum;   
                }
                
                if(sum<x){
                    lo++;
                }
                else{
                    hi--;
                }
            }
        }
        return ans;
    }
}
