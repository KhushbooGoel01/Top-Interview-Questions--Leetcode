//QUESTION'S LINK====
//https://leetcode.com/problems/coin-change-2/

class Solution {
    public int change(int amount, int[] coins) {
      
        int dp[][]=new int[coins.length+1][amount+1];
      
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                dp[i][j]=-1;
      
       return solve(amount,coins,0,dp);
      
    }
    static int solve(int val,int coins[],int i,int dp[][]){
      
        if(val==0) return 1;
        
        if(i>=coins.length) return 0;
      
         if(dp[i][val]!=-1) return dp[i][val];
      
        int taken=0;
      
        if(coins[i]<=val){
            taken=solve(val-coins[i],coins,i,dp);
        }
      
        int nottaken=solve(val,coins,i+1,dp);
      
        return dp[i][val]=taken+nottaken;
    }
}
