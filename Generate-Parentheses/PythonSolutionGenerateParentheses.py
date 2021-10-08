# Question Link: https://leetcode.com/problems/generate-parentheses/

def generateParenthesis(self, n):
    if n == 0:
        return [""]
    self.result = []
    self.helper("", n, 0)
    return self.result
    
def helper(self, pattern, remain_left, remain_right):
    if remain_left == 0 and remain_right == 0:
        self.result.append(pattern)
        return
    if remain_left:
        self.helper(pattern + "(", remain_left - 1, remain_right + 1)
    if remain_right:
        self.helper(pattern + ")", remain_left, remain_right - 1)
