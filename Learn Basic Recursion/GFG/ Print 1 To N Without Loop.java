class Solution
{
    public void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        print(i+1,n);
    }
  public void printNos(int N)
    {
        //Your code here
        print(1,N);
    }
}
