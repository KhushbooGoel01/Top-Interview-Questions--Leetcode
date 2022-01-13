#Link to question - https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/831/

from typing import List


class Solution:

    class Cell:
        def __init__(self, val=0, top=None, right=None, bottom=None, left=None, top_right=None, top_left=None, bottom_left=None, bottom_right=None) -> None:
            self.val = val
            self.top = top
            self.right = right
            self.left = left
            self.bottom = bottom
            self.top_right = top_right
            self.top_left = top_left
            self.bottom_left = bottom_left
            self.bottom_right = bottom_right
            pass

    def gameOfLife(self, board: List[List[int]]) -> None:
        new_board = [list(l) for l in board]

        m = len(board)
        n = len(board[0])

        def get_neighbours(i: int, j: int) -> List[int]:
            neighbours = []

            if i > 0:
                neighbours.append(board[i-1][j])
                if j > 0:
                    neighbours.append(board[i-1][j-1])
                if j < n-1:
                    neighbours.append(board[i-1][j+1])

            if j > 0:
                neighbours.append(board[i][j-1])

            if i < m-1:
                neighbours.append(board[i+1][j])
                if j > 0:
                    neighbours.append(board[i+1][j-1])
                if j < n-1:
                    neighbours.append(board[i+1][j+1])

            if j < n-1:
                neighbours.append(board[i][j+1])

            return neighbours

        for i in range(len(board)):
            for j in range(len(board[i])):
                is_alive = True if board[i][j] == 1 else False
                neighbours = get_neighbours(i, j)

                dead_neighbours = neighbours.count(0)
                alive_neighbours = len(neighbours) - dead_neighbours

                if not is_alive and alive_neighbours == 3:
                    new_board[i][j] = 1
                else:
                    if alive_neighbours < 2 or alive_neighbours > 3:
                        new_board[i][j] = 0

        board.clear()
        board.extend(new_board)


board = [[0, 1, 0],
         [0, 0, 1],
         [1, 1, 1],
         [0, 0, 0]]

print(board)
s = Solution()
s.gameOfLife(board)
print(board)
