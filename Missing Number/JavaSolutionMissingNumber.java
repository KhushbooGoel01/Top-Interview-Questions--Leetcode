// Question Link :- https://leetcode.com/problems/missing-number/

// Below is Solution

//here i try to do the question in complexity O(n) and O(1) space
class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;
        for(int n : nums){
            sum -= n;
        }
        
        return sum;
    }
}
