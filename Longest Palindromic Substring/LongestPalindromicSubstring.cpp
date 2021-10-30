class Solution {
public:
    string findSub(int i, int j, string s) {
        
        string ans = "";
        while(i <= j) {
            
            ans += s[i];
            i++;
        }
        
        return ans;
    }
    string longestPalindrome(string s) {
        
        int dp[s.length()][s.length()];
        int max = 0;
        string ans="";
        
        for(int i = 0; i < s.length(); ++i) {
            
            int st = 0, end = i;
            
            for(int j = 0; j < s.length()-i; ++j) {
                
                if(i > 1) {
                    
                    dp[st][end] = 0;
                    
                    if(s[st] == s[end] && dp[st+1][end-1]) {
                        
                        dp[st][end] = 1;
                       
                        if(end-st > max) {
                                
                            ans = findSub(st, end, s);
                            max = end-st;
                        }
                    }
                }
                else {
                    
                    if(i) {
                        
                        dp[st][end] = 0;
                        
                        if(s[st] == s[end]) {
                            
                            dp[st][end] = 1;
                    
                            if(end-st > max) {
                                
                                ans = findSub(st, end, s);
                                max = end-st;
                            }
                        }
                    }
                    else {
                        
                        dp[st][end] = 1;
                        ans = s[st];
                        max = 0;
                    }
                }
                
                st++;
                end++;
            }
        }        
        return ans;
    }
};
