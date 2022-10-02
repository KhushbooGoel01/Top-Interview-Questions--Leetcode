//https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
      int dp[][]=new int[m+1][n+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
       return solve(0,0,m,n,dp);
    }
    static int solve(int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n || i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int r=solve(i,j+1,m,n,dp);
        int d=solve(i+1,j,m,n,dp);
        return dp[i][j]=r+d;
    }
}
