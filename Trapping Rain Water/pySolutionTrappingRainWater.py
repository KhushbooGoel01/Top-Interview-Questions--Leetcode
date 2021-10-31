class Solution:
    def trap(self, height: List[int]) -> int:
        lheights = []
        maxi = 0 
        for h in height:
            maxi = max(maxi, h)
            lheights.append(maxi)
        
        rheights = []
        maxi = 0 
        for h in height[::-1]:
            maxi = max(maxi, h)
            rheights.append(maxi) 
        rheights = rheights[::-1]    
            
        result = 0    
        for i in range(len(height)):
            result += min(lheights[i], rheights[i]) - height[i]
        return result
