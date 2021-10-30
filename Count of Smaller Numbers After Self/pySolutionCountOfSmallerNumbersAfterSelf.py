from bisect import bisect_left, insort 

class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        ans = [ ]
        lnums = []
        for i in nums[::-1]:
            ans.append(bisect_left(lnums,i))
            insort(lnums,i)
        return ans[::-1]
