class Solution:
    def longestIncreasingPath(self, matrix: List[List[int]]) -> int:
        m,n = len(matrix), len(matrix[0])
        path = [ [0]*m for _ in range(n)]
        d = [(0,1), (1,0), (0, -1), (-1,0)]  
        dp={}
        def abc(x,y):
            if (x,y) not in dp:
                dp[(x,y)]= 1+max([abc(x+i,y+j) for i,j in d if 0<=x+i<m and 0<=y+j<n and matrix[x][y] < matrix[x+i][y+j] ]+[0])
            return dp[(x,y)]
        
        ans=0
        for i in range(m):
            for j in range(n):
                ans=max(ans, abc(i,j))    
        return ans
