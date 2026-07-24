// Last updated: 7/24/2026, 2:47:52 PM
1class Solution {
2    public String reverseWords(String s) {
3        List<String> lis = new ArrayList<>();
4        int i = 0, j = 0;
5        while (j < s.length()) {
6            if (s.charAt(i) != ' ' && (j + 1 == s.length() || s.charAt(j + 1) == ' ')) {
7                lis.add(s.substring(i, j + 1));
8                i = j + 1;
9                j++;
10                continue;
11            }
12            if (s.charAt(i) == ' ') {
13                i++;
14                j = i;
15            } else {
16                j++;
17            }
18        }
19        StringBuilder res = new StringBuilder();
20        for (int k = lis.size() - 1; k >= 0; k--) {
21            res.append(lis.get(k));
22            if (k > 0) {
23                res.append(" ");
24            }
25        }
26        return res.toString();
27    }
28}