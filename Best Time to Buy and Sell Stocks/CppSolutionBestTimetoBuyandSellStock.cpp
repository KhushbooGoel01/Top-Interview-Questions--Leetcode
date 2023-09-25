class Solution {
public:
    
    int maxProfit(vector<int>& v) {
        int n = v.size();
        int curr=0,mx=0;
        for(int i=0;i<n-1;i++){
            curr+=v[i+1]-v[i];
            if(curr<0) curr=0;
            if(curr>mx) mx = curr;
        } return mx;
    }
};