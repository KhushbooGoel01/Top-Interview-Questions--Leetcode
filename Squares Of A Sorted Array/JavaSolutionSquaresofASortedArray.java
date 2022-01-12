//https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int [nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        while(left <= right){                  
        int val1 = nums[left] * nums[left];        
        int val2 = nums[right] * nums[right];        
        if(val1 > val2){                               
            res[index] = val1;                 
            left++;
        }  
        else{
            res[index] = val2;                 
            --right; 
        }
        index--;
    }
    return res;  
    }
}