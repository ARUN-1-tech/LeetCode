// Last updated: 7/9/2026, 10:04:02 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sch=s.toCharArray();
        char[] tch=t.toCharArray();
        int a=process(sch);
        int b=process(tch);
        if(a!=b) return false;
        for(int i=0;i<a;i++){
            if(sch[i]!=tch[i]) return false;
        }
        return true;
    }
    private int process(char[] chars){
        int k=0;
        for(char c:chars){
            if(c!='#'){
                chars[k++]=c;
            }else if(k>0){
                k--;
            }
        }
        return k;
    }
}