// Question: https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && ((n & (n-1)) == 0));
    }
}