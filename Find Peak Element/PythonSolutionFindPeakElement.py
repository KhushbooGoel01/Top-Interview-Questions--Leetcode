// Question link : https://leetcode.com/problems/find-peak-element/submissions/

class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        b = 0
        e = len(nums)-1
        while(b<e):
            m = (int)(b + (e-b)/2)
            if(nums[m]<nums[m+1]):
                b = m+1
            else:
                e = m
        return b
