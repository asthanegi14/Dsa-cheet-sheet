class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        HashMap<Character, Integer> x = new HashMap<>();
        HashMap<Character, Integer> y = new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            x.put(a.charAt(i),x.getOrDefault(a.charAt(i),0)+1);
        }
        
        for(int i=0;i<b.length();i++){
            y.put(b.charAt(i),y.getOrDefault(b.charAt(i),0)+1);
        }
        // System.out.println("x = "+x+"\ny = "+y+"\n");
        if(x.equals(y)){
            return true;
        }
        return false;
    }
}
