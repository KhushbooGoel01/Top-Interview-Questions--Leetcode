# Link to Question: https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/827/

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        if len(nums) == 2:
            return list(nums.reverse())

        ans1 = [1] * len(nums)
        ans2 = [1] * len(nums)

        l = len(nums) - 1

        answer = []

        for i in range(1, len(nums)):
            ans1[i] = ans1[i-1] * nums[i-1]
            ans2[l-i] = ans2[l-i+1] * nums[l-i+1]

        return [ans1[i] * ans2[i] for i in range(len(nums))]

