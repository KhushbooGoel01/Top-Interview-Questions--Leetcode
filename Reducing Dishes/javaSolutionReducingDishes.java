//https://leetcode.com/problems/reducing-dishes/

class Solution {
    public int maxSatisfaction(int[] satis) {
       Arrays.sort(satis);
        int dp[][]=new int[satis.length+1][satis.length+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return solve(satis,0,1,dp);
    }
    static int solve(int arr[],int i,int time,int dp[][]){
        if(i>=arr.length) return 0;
        if(dp[i][time]!=-1) return dp[i][time];
        int taken=(arr[i]*time)+solve(arr,i+1,time+1,dp);
        int not=solve(arr,i+1,time,dp);
       return dp[i][time]=Math.max(0,Math.max(taken,not));
    }
} 
