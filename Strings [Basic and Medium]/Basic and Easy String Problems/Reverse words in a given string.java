class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String s)
    {
        // code here 
        StringBuffer sb = new StringBuffer();
        String[] str = s.split("[.]");
        for(int i=0;i<str.length;i++){
            if(!str[i].isEmpty()){
                sb.insert(0,str[i]);
            }
            if(i<str.length-1){
                sb.insert(0,".");
            }
        }
        return sb.toString();
    }
}
