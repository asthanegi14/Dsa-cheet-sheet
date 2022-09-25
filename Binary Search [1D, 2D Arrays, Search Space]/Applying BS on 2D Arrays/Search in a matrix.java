class Sol
{
    public static int matSearch(int mat[][], int N, int M, int x)
    {
        // your code here
        int i=0,j=M-1;
        while(i<N && j>=0){
            if(mat[i][j]<x){
                i++;
            }
            else if(mat[i][j]>x){
                j--;
            }
            else{
                return 1;
            }
        }
        return 0;
    }
}
