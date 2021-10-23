//PROBLEM LINK: https://leetcode.com/problems/frequency-of-the-most-frequent-element

//PROBLEM SOLUTION:

class Solution {
public:
    int maxFrequency(vector<int> &nums, long long int k)
    {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        int i = 0;
        int ans = 0;
        for (int j = 0; j < n; j++)
        {
            k += nums[j];
            while (k < (long)nums[j] * (j - i + 1))
            {
                k -= nums[i];
                i++;
            }
            ans = max(ans, j - i + 1);
        }
        return ans;
    }
};