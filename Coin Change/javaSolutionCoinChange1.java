//QUESTIION LINK=---
//https://leetcode.com/problems/coin-change/

class Solution {
    public int coinChange(int[] arr, int n) {
         int dp[][]=new int[arr.length+1][n+1];
         for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int ans=solve(arr,0,n,dp);
        if(ans==100000) return -1;
        return ans;
    }
    static int solve(int arr[],int idx,int tar, int dp[][]){
            if(tar==0) return 0;
           if(idx>=arr.length) return 100000;  
        if(dp[idx][tar]!=-1) return dp[idx][tar];
        int l=100000;
        if(arr[idx]<=tar){
            l=1+solve(arr,idx,tar-arr[idx],dp);
        }
        int r=solve(arr,idx+1,tar,dp);
        
        return dp[idx][tar]=Math.min(l,r);
    }
}
