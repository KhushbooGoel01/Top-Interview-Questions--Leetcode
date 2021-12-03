# Question Link :- https://leetcode.com/problems/two-sum/


from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]

# Time Complexity :- O(n^2)
# Space Complexity :- O(1)


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for i in range(len(nums)):
            if nums[i] in dict:
                return [dict[nums[i]], i]
            else:
                dict[target - nums[i]] = i

# Time Complexity :- O(n)
# Space Complexity :- O(n)

