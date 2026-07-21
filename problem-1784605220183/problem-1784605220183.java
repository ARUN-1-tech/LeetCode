// Last updated: 7/21/2026, 9:10:20 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='(' || ch=='[' || ch=='{' ) st.push(ch);
7            else{
8                if(st.isEmpty()) return false;
9                char l=st.peek();
10                if((l=='[' && ch==']') || (l=='(' && ch==')') || (l=='{' && ch=='}')) st.pop();
11                else return false;
12            }
13        }
14        if(!st.isEmpty()) return false;
15        return true;
16    }
17}