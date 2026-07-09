# Last updated: 7/9/2026, 10:07:51 AM
class Solution(object):
    def permute(self, nums):
        res=[]
        def abc(a):
            if len(a)==len(nums):
                res.append(a)
                return
            for i in nums:
                if i in a:
                    continue
                else:
                    abc(a+[i])
        abc([])
        return res