# [Question Link](https://leetcode.com/problems/squares-of-a-sorted-array/)

# Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

# Example 1:
# ```
# Input: nums = [-4,-1,0,3,10]
# Output: [0,1,9,16,100]
# Explanation: After squaring, the array becomes [16,1,0,9,100].
# After sorting, it becomes [0,1,9,16,100].
# ```

# Example 2:
# ```
# Input: nums = [-7,-3,2,3,11]
# Output: [4,9,9,49,121]
#  ```

# Constraints:
# ```
# 1 <= nums.length <= 104
# -104 <= nums[i] <= 104
# nums is sorted in non-decreasing order.
# ```


from typing import List


class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        return sorted([x ** 2 for x in nums])


class Solution2:
    def sortedSquares(self, nums: List[int]) -> List[int]:
          n = len(nums)
          i, j = 0, n - 1
          out = [0] * n
          for k in range(n):
               if abs(nums[i]) > abs(nums[j]):
                    out[k] = nums[i] ** 2
                    i += 1
               else:
                    out[k] = nums[j] ** 2
                    j -= 1
          return out


if __name__ == "__main__":
     s = Solution()
     s2 = Solution2()
     print(s.sortedSquares([-4, -1, 0, 3, 10]))
     print(s.sortedSquares([-7, -3, 2, 3, 11]))
     print(s2.sortedSquares([-4, -1, 0, 3, 10]))
     print(s2.sortedSquares([-7, -3, 2, 3, 11]))

