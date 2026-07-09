# Last updated: 7/9/2026, 10:08:42 AM
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        phone={
            '2': 'abc',
            '3': 'def',
            '4': 'ghi',
            '5': 'jkl',
            '6': 'mno',
            '7': 'pqrs',
            '8': 'tuv',
            '9': 'wxyz'
        }
        def backtrack(com,next):
            if len(next)==0:
                output.append(com)
            else:
                for i in phone[next[0]]:
                    backtrack(com+i,next[1:])
        output=[]
        backtrack("",digits)
        return output
