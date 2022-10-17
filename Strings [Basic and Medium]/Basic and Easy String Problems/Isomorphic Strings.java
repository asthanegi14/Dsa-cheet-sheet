class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        
        Arrays.fill(a,-1);
        Arrays.fill(b,-1);
        
        for(int i=0;i<str1.length();i++){
            int x = (int)str1.charAt(i)-'a';
            int y = (int)str2.charAt(i)-'a';
            // System.out.println(str1.charAt(i)+" = "+x);
            // System.out.println(str2.charAt(i)+" = "+y);

            if(a[x]==-1 && b[y]==-1){
                a[x] = y;
                b[y] = x;
            }
            else if(a[x] != y){
                return false;
            }
        }
        return true;
    }
}
