class Solution {
  
    public int rob(int[] arr)
    {
      
           int dp[]=new int[1000];
      
       for(int i=0;i<1000;i++) dp[i]=-1;
      
          return solve(arr,0,dp);
    }
   public  static int solve(int arr[],int i,int dp[]){
     
        if(i>=arr.length) return 0;
     
        if(dp[i]!=-1){
            return dp[i];
        }
     
        int robbed=arr[i]+solve(arr,i+2,dp);
        int notRobbed=solve(arr,i+1,dp);
     
        return dp[i]=Math.max(robbed,notRobbed);
        
    }
}
