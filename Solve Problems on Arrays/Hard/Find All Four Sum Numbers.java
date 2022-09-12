class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-3;i++){
            if(i==0 || (i>0 && arr[i-1]!=arr[i])){
                for(int j=i+1;j<arr.length-2;j++){
                    if(j==i+1 || (j>i+1 && arr[j-1]!=arr[j])){
                        int lo=j+1,hi=arr.length-1;
                        
                        long add = arr[i]+arr[j];
                        long val = (long)k-add;
                        
                        while(lo<hi){
                            int sum = arr[lo]+arr[hi];
                            if(sum<val){lo++;}
                            else if(sum>val){hi--;}
                            else{
                                ArrayList<Integer> addIt = new ArrayList<>();
                                addIt.add(arr[i]);
                                addIt.add(arr[j]);
                                addIt.add(arr[lo]);
                                addIt.add(arr[hi]);
                                
                                ans.add(addIt);
                                
                                while(lo<hi && arr[lo]==arr[lo+1]){lo++;}
                                while(lo<hi && arr[hi]==arr[hi-1]){hi--;}
                                lo++;hi--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
