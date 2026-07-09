// Last updated: 7/9/2026, 10:05:23 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()) return false;
        // HashMap<Character,Integer> map=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     char a=s.charAt(i);
        //     char b=t.charAt(i);
        //     if(!map.containsKey(a)){
        //         map.put(a,0);
        //     }if(!map.containsKey(b)){
        //         map.put(b,0);
        //     }if(map.containsKey(a)){
        //         map.put(a,map.get(a)+1);
        //     }if(map.containsKey(b)){
        //         map.put(b,map.get(b)-1);
        //     }
        // }
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(map.get(c)!=0) return false;
        // }
        // return true;

        int[] c=new int[26];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int n:c){
            if(n!=0) return false;
        }
        return true;
    }
}