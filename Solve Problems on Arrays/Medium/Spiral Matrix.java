class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    List<Integer> ans = new ArrayList<>();
	    
	    int top=0,l=0,r=m-1,bot=n-1;
	    
	    while(top<=bot && l<=r){
	        for(int i=l;i<=r;i++){
	            ans.add(a[top][i]);
	        }
	        top++;
	        for(int i=top;i<=bot;i++){
	            ans.add(a[i][r]);
	        }
	        r--;
	        if(top<=bot){
	            for(int i=r;i>=l;i--){
	                ans.add(a[bot][i]);
	            }
	            bot--;
	        }
	        
	        if(l<=r){
	            for(int i=bot;i>=top;i--){
	                ans.add(a[i][l]);
	            }
	            l++;
	        }
	    }
	        return ans.get(k-1);
	}
	
}
