class Solution:
    def maxSatisfaction(self, data: List[int]) -> int:
        data = sorted(data, reverse=True)
        ans = s = 0
        for i in data:
            s+=i
            if s>=0: ans+=s
            else: break
        return ans
