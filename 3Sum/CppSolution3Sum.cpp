# Question Link: https://leetcode.com/problems/3sum/


vector<vector<int>> threeSum(vector<int>& nums) {
    set<vector<int> >rs;
    sort(nums.begin(), nums.end());
    int i, j, k;
    int n = nums.size();
    for (i = 0; i < n - 2; i++) {
        j = i+1;
        k = n-1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                vector<int> tmp(3);
                tmp[0] = nums[i];
                tmp[1] = nums[j];
                tmp[2] = nums[k];
                rs.insert(tmp);
                j++;
                k--;
            } else if (sum > 0) {
                k--;
            } else if (sum < 0) {
                j++;
            }
        }
    }
    vector<vector <int> >result (rs.begin(), rs.end());
    return result;
