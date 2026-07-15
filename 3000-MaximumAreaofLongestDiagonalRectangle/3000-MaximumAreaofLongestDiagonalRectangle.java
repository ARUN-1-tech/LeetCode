// Last updated: 7/15/2026, 12:24:23 PM
1class Solution {
2    public List<List<Integer>> findWinners(int[][] mat) {
3        Map<Integer,Integer> map=new HashMap<>();
4        List<List<Integer>> ans=new ArrayList<>();
5        for (int[] match: mat) {
6            map.putIfAbsent(match[0], 0);
7            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
8        }
9        List<Integer> zeroLoss = new ArrayList<>();
10        List<Integer> oneLoss = new ArrayList<>();
11        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
12            int player = entry.getKey();
13            int losses = entry.getValue();
14            
15            if (losses == 0) {
16                zeroLoss.add(player);
17            } else if (losses == 1) {
18                oneLoss.add(player);
19            }
20        }
21        Collections.sort(zeroLoss);
22        Collections.sort(oneLoss);
23        ans.add(zeroLoss);
24        ans.add(oneLoss);
25        return ans;
26    }
27}