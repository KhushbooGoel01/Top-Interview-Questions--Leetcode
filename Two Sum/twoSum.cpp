// Question Link :- https://leetcode.com/problems/two-sum/

// Below is Solution

//1st Approach
// Time Complexity :- O(n^2)

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       vector<int> v;
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){
                    v.push_back(i);
                    v.push_back(j);
                }
            }
        }
        return v;
    }
};

//OR

//2nd Approach
//HashMaps
//Time Complexity-O(n) 

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
     unordered_map<int,int> m;
        for(int i=0;i<nums.size();i++){
            int x=nums[i];
            int y=target-x;
            if(m.find(y)!=m.end()){
                return {i,m[y]};
            }
            m[nums[i]]=i;
        }
       return {-1,-1}; 
    }
};
