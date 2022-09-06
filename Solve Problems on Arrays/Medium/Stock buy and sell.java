class Solution {
    public void stockBuySell(int[] price, int n) {
        // code here
        int min=price[0];
        int pro=0;
        for(int i=0;i<price.length;i++){
            if(min>price[i]){
                min=price[i];
            }
            pro=Math.max(pro,price[i]-min);
        }
    }
}   
