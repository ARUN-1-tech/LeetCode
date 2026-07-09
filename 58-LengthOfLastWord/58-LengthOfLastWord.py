# Last updated: 7/9/2026, 10:07:41 AM
class Solution(object):
    def lengthOfLastWord(self, s):
        a=list(map(str,s.split()))
        return len(a[-1])
        