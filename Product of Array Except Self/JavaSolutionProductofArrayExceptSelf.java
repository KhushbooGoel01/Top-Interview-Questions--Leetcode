//Question: https://leetcode.com/problems/product-of-array-except-self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodExcept[]=new int[nums.length];
        int product=1;
        for(int i=0; i<nums.length; i++)
        {
            prodExcept[i]=product;
            product*=nums[i];
        }
        product=1;
        for(int i=nums.length-1; i>=0; i--)
        {
            prodExcept[i]*=product;
            product*=nums[i];
        }
        return prodExcept;
    }
}