# Last updated: 7/9/2026, 10:04:03 AM
class Solution(object):
    def kthGrammar(self, n, k):
        if n==1:
            return 0
        parent=self.kthGrammar(n-1,(k+1)//2)
        if k%2==1:
            return parent
        else:
            return 1-parent