//https://leetcode.com/problems/power-of-two/
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        if(n%2==1) return false;
        if(n==2)  return true;
          
        return isPowerOfTwo(n/2);
    }
}
