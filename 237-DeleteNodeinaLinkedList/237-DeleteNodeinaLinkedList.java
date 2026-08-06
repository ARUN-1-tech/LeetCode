// Last updated: 8/6/2026, 2:15:43 PM
1class Solution {
2    public String simplifyPath(String path) {
3        String[] arr=path.split("/");
4        Stack<String> st=new Stack<>();
5        for(String ch:arr){
6            if(ch.equals("") || ch.equals(".")) continue;
7            else if(ch.equals("..")){
8                if(!st.isEmpty()){
9                    st.pop();
10                }
11            }
12            else st.push(ch);
13        }
14        StringBuilder sc=new StringBuilder();
15        for(int i=0;i<=st.size()-1;i++){
16            sc.append("/").append(st.get(i));
17        }
18        if(st.size()<=0) return "/";
19        return new String(sc);
20    }
21}