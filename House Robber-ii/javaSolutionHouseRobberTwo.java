class Solution {
  
     public int rob(int[] arr)
    {
         if(arr.length==1) return arr[0];
         int dp1[]=new int[101];
         int dp2[]=new int[101];
         Arrays.fill(dp1,-1);
         Arrays.fill(dp2,-1);

          int x=solve(arr,0,arr.length-1,dp1);
          int y=solve(arr,1,arr.length,dp2);
       
         return Math.max(x,y);

    }
    public static int solve(int arr[],int i,int n,int dp[]){
        if(i>=n) return 0;
      
        if(dp[i]!=-1){
            return dp[i];
        }
      
        int rob=arr[i]+solve(arr,i+2,n,dp);
        int not=solve(arr,i+1,n,dp);
      
        return dp[i]=Math.max(rob,not);
        
    }
}
