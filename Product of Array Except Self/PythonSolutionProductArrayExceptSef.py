# Question: https://leetcode.com/problems/product-of-array-except-self


from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Solution 1 - O(n) time and O(n) space
        # product = 1
        # for i in range(len(nums)):
        #     product *= nums[i]
        # result = [product // nums[i] for i in range(len(nums))]
        # return result

        # Solution 2 - O(n) time and O(1) space
        # left = [1] * len(nums)
        # right = [1] * len(nums)
        # for i in range(1, len(nums)):
        #     left[i] = left[i - 1] * nums[i - 1]
        # for i in range(len(nums) - 2, -1, -1):
        #     right[i] = right[i + 1] * nums[i + 1]
        # result = [left[i] * right[i] for i in range(len(nums))]
        # return result

        # Solution 3 - O(n) time and O(1) space
        result = [1] * len(nums)
        left = 1
        for i in range(len(nums)):
            result[i] *= left
            left *= nums[i]
        right = 1
        for i in range(len(nums) - 1, -1, -1):
            result[i] *= right
            right *= nums[i]
        return result


if __name__ == "__main__":
     nums = [1, 2, 3, 4]
     print(Solution().productExceptSelf(nums))