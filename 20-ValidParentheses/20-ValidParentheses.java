// Last updated: 7/9/2026, 10:08:39 AM
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') st.push(s.charAt(i));
            else {
                if(st.size()==0) return false;
                else if(s.charAt(i) == ')'){
                    if(st.peek()=='(') st.pop();
                    else return false;
                }
                else if(s.charAt(i) == ']'){
                    if(st.peek()=='[') st.pop();
                    else return false;
                }
                else if(s.charAt(i) == '}'){
                    if(st.peek()=='{') st.pop();
                    else return false;
                }
            }
            i++;
        }
        if(st.size()>=1) return false;
        return true;
    }
}