// Last updated: 8/8/2026, 10:35:56 AM
1class Solution {
2    public String reverseWords(String s) {
3        int i=0,j=1,n=s.length();
4        StringBuilder str=new StringBuilder();
5        while(j<n){
6            while(j<n && s.charAt(j)!=' '){
7                j++;
8            }
9            int b=j-1;
10            while(b>=i){
11                str.append(s.charAt(b));
12                b--;
13            }
14            if(j<=n-1) str.append(" ");
15            j++;
16            i=j;
17        }
18        return new String(str);
19    }
20}