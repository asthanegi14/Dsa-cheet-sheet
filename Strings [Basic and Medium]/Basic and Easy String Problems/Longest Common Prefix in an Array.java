class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int min = arr[0].length();
        String ans = "";
        for(int i=0;i<arr.length;i++){
            min = Math.min(arr[i].length(),min);
        }
        for(int i=0;i<min;i++){
            char c = arr[0].charAt(i);
            for(int j=1;j<arr.length;j++){
                if(arr[j].charAt(i) != c){
                    return (ans.isEmpty()?"-1":ans);
                }
            }
            if(arr[arr.length-1].charAt(i)==c){
                ans+=c;
            }
            if(i==min-1){
                return (ans.isEmpty()?"-1":ans);
            }
        }
        return "-1";
    }
}
