# Last updated: 7/9/2026, 10:07:57 AM
class Solution(object):
    def combinationSum(self, candidates, target):
        res=[]
        def abc(ind,lis,tot):
            if tot==target:
                res.append(lis)
                return
            if tot>target or ind==len(candidates):
                return
            abc(ind,lis+[candidates[ind]],tot+candidates[ind])
            abc(ind+1,lis,tot)
        abc(0,[],0)
        return res