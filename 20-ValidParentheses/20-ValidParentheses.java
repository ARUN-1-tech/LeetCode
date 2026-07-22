// Last updated: 7/22/2026, 10:21:27 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        int n=num1.length();
4        int m=num2.length(),ans=0;
5        if (num1.equals("0") || num2.equals("0")) return "0";
6        int[] res=new int[m+n];
7        for(int i=n-1;i>=0;i--){
8            int d1=num1.charAt(i)-'0';
9            for(int j=m-1;j>=0;j--){
10                int d2=num2.charAt(j)-'0';
11                int mul=d1*d2;
12                int p1 = i + j;
13                int p2 = i + j + 1;
14                int sum = mul + res[p2]; 
15                res[p2] = sum % 10; 
16                res[p1] += sum / 10;
17            }
18        }
19        StringBuilder sb = new StringBuilder();
20        for (int z : res) {
21            if (!(sb.length() == 0 && z == 0)) {
22                sb.append(z);
23            }
24        }
25        return sb.toString(); 
26    }
27}