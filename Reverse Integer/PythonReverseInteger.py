#Question: https://leetcode.com/problems/reverse-integer/

class Solution:
    def reverse(self, x: int) -> int:
        ans = 0
        sign = 1 if x>0 else -1
        x = abs(x)
        while x:
            ans= ans*10 + x%10
            x//=10
        return ans*sign  if (ans<=2**31 -1 and ans>=-2**31 ) else 0