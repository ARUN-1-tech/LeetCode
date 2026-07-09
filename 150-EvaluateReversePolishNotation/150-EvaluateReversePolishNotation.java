// Last updated: 7/9/2026, 10:06:10 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(s.equals("+")) st.push(a+b);
                else if(s.equals("-")) st.push(b-a);
                else if(s.equals("*")) st.push(a*b);
                else st.push(b/a);
            }
            else st.push(Integer.parseInt(s));
        }
        return st.pop();
    }
}