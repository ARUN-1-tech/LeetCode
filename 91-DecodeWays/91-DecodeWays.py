# Last updated: 7/9/2026, 10:07:11 AM
class Solution:
    def numDecodings(self, s):
        memo={}
        def solve(i):
            if i in memo:
                return memo[i]
            if i>=len(s):
                return 1
            if s[i]=='0':
                return 0
            ans=solve(i+1)
            if i+1<len(s) and int(s[i:i+2])<=26:
                ans+=solve(i+2)
            memo[i]=ans
            return ans
        return solve(0)