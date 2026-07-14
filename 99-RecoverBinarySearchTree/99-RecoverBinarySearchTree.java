// Last updated: 7/14/2026, 9:13:51 AM
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> ans=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            if(i%15==0) ans.add("FizzBuzz");
6            else if(i%3==0) ans.add("Fizz");
7            else if(i%5==0) ans.add("Buzz");
8            else ans.add(Integer.toString(i));
9        }
10        return ans;
11    }
12}