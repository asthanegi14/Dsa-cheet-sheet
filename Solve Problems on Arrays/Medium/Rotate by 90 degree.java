class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        //transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int  temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //reverse it
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=temp;
            }
        }
    }
}
