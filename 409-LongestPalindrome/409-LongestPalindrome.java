// Last updated: 7/9/2026, 10:04:59 AM
class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int j=1,c=0;
        for(int n:map.values()){
            if(n%2==0) c+=n;
            else {
                c+=(n-1);
                if(j==1){
                    c+=1;
                    j--;
                }
            }
        }
        return c;
    }
}