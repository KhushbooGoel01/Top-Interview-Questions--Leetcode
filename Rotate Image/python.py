video : https://www.youtube.com/watch?v=uSanzwcYEZg&list=PLlMTxcUZWpmBjE3Zm8pdgGfvG2iPOqk7m

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        
        for i in range(len(matrix)):
            for j in range(i,len(matrix)):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j] 
                #this is to transpose matrix
        for l in matrix:
            l.reverse()
