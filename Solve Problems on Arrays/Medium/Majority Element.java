class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int c=0,ans=-1;
        for(int i:a){
            if(c==0){
                ans=i;
            }
            if(i==ans){
                c++;
            }
            else{
                c--;
            }
        }
        int ret=0;
        for(int i:a){
            if(i==ans){
                ret++;
            }
        }
        return (ret>size/2)?ans:-1;
        
    }
}
