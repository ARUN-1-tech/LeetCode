// Last updated: 7/24/2026, 7:43:19 PM
1class Solution {
2    public List<Integer> getRow(int num) {
3        List<List<Integer>> lis=new ArrayList<>();
4        for(int i=0;i<=num;i++){
5            List<Integer> abc=new ArrayList<>();
6            for(int j=0;j<=i;j++){
7                if(j==i || j==0) abc.add(1);
8                else{
9                    int l=lis.get(i-1).get(j-1);  
10                    int r=lis.get(i-1).get(j);     
11                    abc.add(l+r); 
12                }                      
13            }
14            lis.add(abc);
15        }
16        return lis.get(num);
17    }
18}