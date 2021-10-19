#Question link: https://leetcode.com/problems/bag-of-tokens/

def bagOfTokensScore(self, tokens, P):
        res = cur = 0
        d = collections.deque(sorted(tokens))
        
        while d and (d[0] <= P or cur):
            if d[0] <= P:
                P -= d.popleft()
                cur += 1
            else:
                P += d.pop()
                cur -= 1
            res = max(res, cur)
            
        return res
