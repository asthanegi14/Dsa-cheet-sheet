class Solution
{
    public void  MakeZeros(int[][] matrix)
    {
        // code here
        
        int[][] vis = new int[matrix.length][matrix[0].length];
     
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){   
                int sum=0;
                if(matrix[i][j]==0){
                    if(i-1>=0){
                        sum+=matrix[i-1][j];
                        vis[i-1][j]=-1;
                    }
                    if(i+1<matrix.length){
                        sum+=matrix[i+1][j];
                        vis[i+1][j]=-1;
                    }
                    if(j-1>=0){
                        sum+=matrix[i][j-1];
                        vis[i][j-1]=-1;
                    }
                    if(j+1<matrix[0].length){
                        sum+=matrix[i][j+1];
                        vis[i][j+1]=-1;
                    }
                    vis[i][j]=sum;
                }
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(vis[i][j]==-1){
                    matrix[i][j]=0;
                }
                if(vis[i][j]>0){
                    matrix[i][j]=vis[i][j];
                }
            }
        }
    }
}
