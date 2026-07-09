# Last updated: 7/9/2026, 10:06:21 AM
class Solution:
    def wordBreak(self, s, wordDict):
        wordSet=set(wordDict)
        memo={}

        def backtrack(start):
            if start==len(s):
                return [""]

            if start in memo:
                return memo[start]

            res=[]

            for end in range(start+1,len(s)+1):
                word=s[start:end]

                if word in wordSet:
                    subs=backtrack(end)

                    for sub in subs:
                        if sub=="":
                            res.append(word)
                        else:
                            res.append(word+" "+sub)

            memo[start]=res
            return res

        return backtrack(0)