class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> a:map.entrySet()){
            ans.add(a.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}
