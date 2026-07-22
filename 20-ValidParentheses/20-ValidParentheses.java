// Last updated: 7/22/2026, 9:59:48 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3        int n=num1.length();
4        int m=num2.length(),ans=0;
5        if (num1.equals("0") || num2.equals("0")) return "0";
6        int[] res=new int[m+n];
7        Arrays.fill(res,0);
8        for(int i=n-1;i>=0;i--){
9            int d1=num1.charAt(i)-'0';
10            for(int j=m-1;j>=0;j--){
11                int d2=num2.charAt(j)-'0';
12                int mul=d1*d2;
13                int p1 = i + j;
14                int p2 = i + j + 1;
15                int sum = mul + res[p2]; 
16                res[p2] = sum % 10; 
17                res[p1] += sum / 10;
18            }
19        }
20        StringBuilder sb = new StringBuilder();
21        for (int z : res) {
22            if (!(sb.length() == 0 && z == 0)) {
23                sb.append(z);
24            }
25        }
26        return sb.toString(); 
27    }
28}