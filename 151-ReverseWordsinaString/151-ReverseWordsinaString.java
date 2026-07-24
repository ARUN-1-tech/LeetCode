// Last updated: 7/24/2026, 2:45:21 PM
1class Solution {
2    public String reverseWords(String s) {
3        List<String> lis = new ArrayList<>();
4        int i = 0, j = 0;
5        
6        while (j < s.length()) {
7            if (s.charAt(i) != ' ' && (j + 1 == s.length() || s.charAt(j + 1) == ' ')) {
8                lis.add(s.substring(i, j + 1));
9                i = j + 1;
10                j++;
11                continue;
12            }
13            
14            if (s.charAt(i) == ' ') {
15                i++;
16                j = i;
17            } else {
18                j++;
19            }
20        }
21        
22        String res = "";
23        for (int k = lis.size() - 1; k >= 0; k--) {
24            res += lis.get(k);
25            if (k > 0) {
26                res += " ";
27            }
28        }
29        return res;
30    }
31}