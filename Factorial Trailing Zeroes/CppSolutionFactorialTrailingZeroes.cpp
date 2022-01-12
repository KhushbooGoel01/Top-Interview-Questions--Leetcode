class Solution {
public:
    int trailingZeroes(int n) {
        
        int num = 5, ans = 0;
        
        while(n/num) {
            
            ans += n/num;
            num *= 5;
        }
        return ans;
    }
};
