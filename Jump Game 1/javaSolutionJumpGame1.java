//QUESTION'S LINK===
// https://leetcode.com/problems/jump-game/
class Solution {
    public boolean canJump(int[] nums) {
        //
        int max_reach=0;
        if(nums.length==1) return true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(max_reach==i){
                    return false;
                }
            }
            max_reach=Math.max(max_reach,i+nums[i]);
            if(max_reach>=nums.length-1){
                return true;
            }
        }
        return false;
    }
    
}
