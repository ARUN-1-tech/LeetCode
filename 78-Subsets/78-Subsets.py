# Last updated: 7/9/2026, 10:07:20 AM
class Solution(object):
    def subsets(self, nums):
        res=[]
        def abc(index,cur):
            if index==len(nums):
                res.append(cur)
                return
            abc(index+1,cur)
            abc(index+1,cur+[nums[index]])
        abc(0,[])
        return res