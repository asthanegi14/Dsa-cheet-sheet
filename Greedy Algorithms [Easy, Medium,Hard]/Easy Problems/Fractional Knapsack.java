class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double[][] sort = new double[n][2];
        for(int i=0;i<n;i++){
            sort[i][0] = i;
            sort[i][1] = arr[i].value/(double)arr[i].weight;
        }
        Arrays.sort(sort, Comparator.comparingDouble(o->o[1]));
        double sum = 0;
        
        for(int i=n-1;i>=0;i--){
            int j=(int)sort[i][0];
            if(W!=0){
                if(arr[j].weight<= W){
                    sum += arr[j].value;
                    W-=arr[j].weight;
                }
                else{
                    sum += sort[i][1]*W;
                    W=0;
                }  
            }
        }
        return sum;
    }
}
