def is_valid(pos, y):
	isValid = y not in pos
	for i,j in enumerate(pos):
		if abs(i-len(pos)) == abs(j-y):
			isValid = False 
	return isValid

def nqueens(pos, size):
	if len(pos)==size: return [pos]

	ans = []
	for i in range(size):
		if is_valid(pos, i):
			ans +=  nqueens(pos+[i], size)
	return ans 

class Solution:
    def totalNQueens(self, n: int) -> int:
        return len(nqueens([], n))
