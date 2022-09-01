class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer, Integer> ans = new HashMap<>();
        
        for(int i=0;i<N;i++){
            if(ans.containsKey(arr[i])){
                ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
            }
            else{
                ans.put(arr[i],1);
            } 
        }
        for(int i=0;i<N;i++){
            arr[i]=0;
        }
        for(Map.Entry<Integer, Integer> a : ans.entrySet()){
            if(a.getKey()-1<N){
               arr[a.getKey()-1] = a.getValue();
            }
        }
    }
}
