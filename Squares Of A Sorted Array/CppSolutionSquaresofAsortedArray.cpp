// Problem link -: https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
      vector <int> res(nums.size(), 0);
        int i=0, j=nums.size()-1, k=nums.size()-1;
        while(i<=j)
        {
            if(abs(nums[i])>abs(nums[j]))
            {
                res[k--] = abs(nums[i])*abs(nums[i]);
                i++;
            }
            else
            {
                res[k--] = abs(nums[j])*abs(nums[j]);
                j--;
            }
        }
        return res;
    }
};
