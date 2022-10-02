//https://leetcode.com/problems/2-keys-keyboard/

class Solution {
    public int minSteps(int n) {
      
        if(n==0 ||n==1) return 0;
        if(n==2) return 2;
      
      return 2+solve(n,1,2);
    }
    public static int solve(int n,int copy,int len){
          if(len==n) return 0;
      
        if(len>n) return 100000;
      
           int copyPaste=2+solve(n,len,len+len);
           int paste=1+solve(n,copy,len+copy);
      
            return Math.min(copyPaste,paste);
      
    }
}
