// Last updated: 7/24/2026, 3:59:44 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int[] ans=new int[26];
4        for(char ch:word.toCharArray()){
5            ans[ch-'a']++;
6        }
7        Arrays.sort(ans);
8        int c=0,k=0;
9        for(int i=25;i>=0;i--){
10            if(ans[i]==0) break;
11            c+=((k/8)+1)*ans[i];
12            k++;
13        }
14        return c;
15    }
16}