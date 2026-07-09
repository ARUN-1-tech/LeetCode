# Last updated: 7/9/2026, 10:05:04 AM
class Solution(object):
    def lastRemaining(self, n):
        if n==1:
            return 1
        s=self.lastRemaining(n//2)
        res= 2*(n//2+1-s)
        return res