// Last updated: 7/9/2026, 10:03:54 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int c=0,a=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<a;i++){
            char x=s.charAt(i);
            if(x=='('){
                st.push(x);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    c++;
                }
            }
        }
        c+=st.size();
        return c;
    }
}