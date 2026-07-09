// Last updated: 7/9/2026, 10:04:11 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
            int val=a;
            if(val<0){
                while(st.size()>0 && st.peek()<-val && st.peek()>0) st.pop();
                if(st.size()>0 && st.peek()==-val) st.pop();
                else if(st.size()>0 && st.peek()>-val) continue;
                else st.push(val);
            }else{
                st.push(val);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
}