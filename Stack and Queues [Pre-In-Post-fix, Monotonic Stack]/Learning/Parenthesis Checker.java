class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(')');
            }
            else if(c=='['){
                st.push(']');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='('){
                st.push(')');
            }
            else if(st.isEmpty() || st.pop()!=c){
                return false;
            }
        }
        return st.isEmpty();
    }
}
