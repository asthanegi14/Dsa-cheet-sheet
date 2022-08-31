class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int j=0;
        for(int i=1;i<N;i++){
            if(A[j]!=A[i]){
                j++;
                A[j] = A[i];
            }
        }
        return j+1;
    }
}
