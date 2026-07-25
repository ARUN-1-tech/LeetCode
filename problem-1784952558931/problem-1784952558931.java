// Last updated: 7/25/2026, 9:39:18 AM
1class Solution {
2    public String countAndSay(int n) {
3        StringBuilder str=new StringBuilder("1");
4        for(int i=1;i<n;i++){
5            StringBuilder nex=new StringBuilder();
6            char[] ans=str.toString().toCharArray();
7            char c=ans[0];
8            int co=0;
9            for(char num:ans){
10                if(num==c) co++;
11                else{
12                    nex.append(co).append(c);
13                    c=num;co=1;
14                }
15            }
16            nex.append(co).append(c);
17            str=nex;
18        }
19        return str.toString();
20    }
21}