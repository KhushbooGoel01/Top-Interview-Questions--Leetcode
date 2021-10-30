class Solution:
    def maxPoints(self, points: List[List[int]]) -> int:
        
        primes = [2]
        for  i in range(3, 101):
            for j in primes:
                if j*j>i: 
                    primes += [i]
                    break
                if i%j==0: 
                    break

        ans=0
        for i in range(len(points)):
            slopes = {}
            for j in range(len(points)):
                if i==j: continue
                x1,y1 = points[i]
                x2,y2 = points[j]
                y,x = y2-y1, x2-x1
                #print(x,y)
                for p in primes:
                    if p>abs(y) and p>abs(x): break
                    while x%p==0 and y%p==0: 
                        x//=p
                        y//=p
                
                slopes[(x,y)] = slopes.get((x,y), 0) + 1 
            ans = max(ans, max(list(slopes.values())+[0])+1)
        return ans
