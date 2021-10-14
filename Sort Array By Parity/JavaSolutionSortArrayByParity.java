// Question Link :- https://leetcode.com/problems/sort-array-by-parity/

// Below is Solution
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int last = nums.length - 1;
        int i = 0;
        int temp;
        while(i<=last){
            if(nums[i]==0){
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                i++;
                start++;
            }else if(nums[i] % 2 == 0){
                i++;
            }else{
                temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last--;
            }
        }
        return nums;
    }
}