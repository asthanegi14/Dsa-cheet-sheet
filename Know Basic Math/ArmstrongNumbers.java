class Solution {
    static String armstrongNumber(int n){
        // code here
        int org=n;
        int dig = 0,num=n;
        int sum=0;
        while(org!=0){
            org/=10;
            dig++;
        }
        while(n!=0){
            int f = n%10;
            sum+=Math.pow(f,dig);
            n/=10;
        }
        if(num==sum){return "Yes";}
        else{
            return "No";
        }
    }
}
