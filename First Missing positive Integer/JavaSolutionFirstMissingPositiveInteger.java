//https://leetcode.com/problems/first-missing-positive/

class Solution {
    public int firstMissingPositive(int[] nums) {
       int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 1 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val != n + 1 && nums[val - 1] > 0) {
                nums[val - 1] = - nums[val - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }  

        return n + 1;
    }
} 