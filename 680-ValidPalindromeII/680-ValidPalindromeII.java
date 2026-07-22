// Last updated: 7/22/2026, 12:07:51 PM
1class Solution {
2    public boolean closeStrings(String word1, String word2) {
3        int[] ar1=new int[26];
4        int[] ar2=new int[26];
5        for(char c:word1.toCharArray()){
6            ar1[c-'a']++;
7        }
8        for(char c:word2.toCharArray()){
9            ar2[c-'a']++;
10        }
11        for(int i=0;i<26;i++){
12            if((ar1[i]==0 && ar2[i]!=0)||(ar1[i]!=0 && ar2[i]==0)) return false;
13        }
14        Arrays.sort(ar1);
15        Arrays.sort(ar2);
16        for (int i = 0; i < 26; i++) {
17            if (ar1[i] != ar2[i]) {
18                return false;
19            }
20        }
21        return true;
22    }
23}