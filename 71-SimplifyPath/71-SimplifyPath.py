# Last updated: 7/9/2026, 10:07:27 AM
class Solution:
    def simplifyPath(self, path):
        stack = []

        for part in path.split("/"):
            if part == "" or part == ".":
                continue
            if part == "..":
                if stack:
                    stack.pop()
            else:
                stack.append(part)

        return "/" + "/".join(stack)