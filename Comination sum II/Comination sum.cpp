
 //Question Link : https://leetcode.com/problems/combination-sum-ii/
 
class Solution {
public:
     vector<vector<int>>ans;
    void solve(int start, int target,vector<int>&arr,vector<int>&temp ){
       if(target==0)
       {
           ans.push_back(temp);
           return;
       }
        
        for(int i=start;i<arr.size();i++)
        {
          if(i>start && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            temp.push_back(arr[i]);
            solve(i+1,target-arr[i],arr,temp);
            temp.pop_back();
        }
        
    }
    
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        
      
        vector<int>temp;
        
       sort(candidates.begin(),candidates.end());
        solve(0, target,candidates, temp );
        return ans;
        
        
        
        
    }
};