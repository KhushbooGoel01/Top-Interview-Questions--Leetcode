// Question Link :- https://leetcode.com/problems/two-sum/

// Below is Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ansArray = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if((nums[i] + nums[j] == target) && (i!=j)){
                    ansArray[0] = i;
                    ansArray[1] = j;
                }
            }
        }
        return ansArray;
    }
}
// Time Complexity :- O(n^2)