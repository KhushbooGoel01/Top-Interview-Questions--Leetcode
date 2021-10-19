# Question Link: https://leetcode.com/problems/bag-of-tokens/

 int bagOfTokensScore(vector<int>& tokens, int P) {
        sort(tokens.begin(), tokens.end());
        
        int res = 0, points = 0, i = 0, j = tokens.size() - 1;
        
        while (i <= j) {
            if (P >= tokens[i]) {
                P -= tokens[i];
                i++;
                res = max(res, ++points);
                
            }
            else if (points > 0) {
                points--;
                P += tokens[j];
                j--;
            }
            else {
                break;
            }
        }
        return res;
    }
