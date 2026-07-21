// Last updated: 7/21/2026, 9:04:59 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='(') st.push(ch);
7            else if(ch=='[') st.push(ch);
8            else if(ch=='{') st.push(ch);
9            else{
10                if(st.isEmpty()) return false;
11                char l=st.peek();
12                if(l=='[' && ch==']') st.pop();
13                else if(l=='(' && ch==')') st.pop();
14                else if(l=='{' && ch=='}') st.pop();
15                else return false;
16            }
17        }
18        if(!st.isEmpty()) return false;
19        return true;
20    }
21}