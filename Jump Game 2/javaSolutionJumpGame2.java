//QUESTION'S LINK===
// https://leetcode.com/problems/jump-game-ii/
class Solution {
    public int jump(int[] nums) {
         int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=100000;
        }
        return solve(nums,0,dp);
       
    }
    static int solve(int nums[],int idx,int dp[]){
        if(idx>=nums.length-1) return 0;
        int min=100000;
        if(dp[idx]!=min){
            return dp[idx];
        }
         for(int i=1;i<=nums[idx];i++){
             min=Math.min(min,1+solve(nums,idx+i,dp));
         }
       
        return dp[idx]=min;
    }
}
© 2021 GitHub, Inc.
Ter
