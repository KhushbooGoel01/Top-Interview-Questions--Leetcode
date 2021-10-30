//https://leetcode.com/problems/unique-paths-ii/

class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int m=o.length;
        int n=o[0].length;
      
         int dp[][]=new int[m+1][n+1];
      
        if(o[0][0]==1) return 0;
      
        if(o[m-1][n-1]==1) return 0;
      
        dp[1][1]=1;
      
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(i==1 && j==1) continue;
                if(o[i-1][j-1]==1){
                    dp[i][j]=0;
                }else
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
      
        return dp[m][n]; 
    }
}
