# Last updated: 7/9/2026, 10:08:20 AM
class Solution(object):
    def strStr(self, haystack, needle):
        a=1
        if needle in haystack:
            a=haystack.index(needle)
            return a
        return -1
        