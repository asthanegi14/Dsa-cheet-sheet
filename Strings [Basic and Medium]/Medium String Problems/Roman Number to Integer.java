class Solution {
    // Finds decimal value of a given roman numeral
    public int find(char s){
        if(s=='I'){
            return 1;
        }
        if(s=='V'){
            return 5;
        }
        if(s=='X'){
            return 10;
        }
        if(s=='L'){
            return 50;
        }
        if(s=='C'){
            return 100;
        }
        if(s=='D'){
            return 500;
        }
        if(s=='M'){
            return 1000;
        }
        return 0;
    }
    public int romanToDecimal(String str) {
        // code here
        int sum=0;
        for(int i=1;i<str.length();i++){
            int x = find(str.charAt(i));
            int y = find(str.charAt(i-1));
            
            if(x<=y){
                sum+=y;
            }
            else{
                sum-=y;
            }
        }
        sum+=find(str.charAt(str.length()-1));
        return sum;
    }
}
