//Problem Link: https://leetcode.com/problems/3sum/

//Approach : 2 Pointers 

//TC = O(N^2)
//SC = O(M)[for storage for answers]

#include <bits/stdc++.h>
using namespace std;

class Solution {
    public:
    vector<vector<int>> threeSum(vector<int> nums) {
        vector<vector<int>> ans;  
        if(nums.size() < 3) return ans;
            
        sort(nums.begin(), nums.end());        
        for(int i = 0; i < nums.size()-2; i++){            
            if(i == 0 || ( i > 0 && nums[i] != nums[i-1])){                
                int lo = i+1, hi = nums.size()-1, sum = 0 - nums[i]; 
                
                while(lo < hi){                    
                    if(nums[lo] + nums[hi] == sum){
                        ans.push_back({nums[i],nums[lo],nums[hi]});
                        
                        while(lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo < hi && nums[hi] == nums[hi-1]) hi--;
                        
                        lo++;
                        hi--;
                }
                else if(nums[lo] + nums[hi] < sum) lo++;
                else hi--;
                }
            }
        }
        return ans;
    }
};