# Link to question: https://leetcode.com/explore/interview/card/top-interview-questions-hard/116/array-and-strings/828/


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []

        m = len(matrix)
        n = len(matrix[0])


        low_m = -1
        low_n = -1

        if m == 1:
            return list(matrix[0])

        if n == 1:
            for l in matrix:
                result.extend(l)
            return result

        r, c = 0, 0
        r_increment = 0
        c_increment = 1

        while n > low_n + 1 and m > low_m + 1:
            # print('adding (', r, ',', c, ') -> ', (m, n, low_m, low_n), sep='')
            result.append(matrix[r][c])

            r += r_increment
            c += c_increment

            if c >= n:
                c -= 1
                r += 1
                c_increment = 0
                r_increment = 1
                low_m += 1

            if r >= m:
                r -= 1
                c -= 1
                r_increment = 0
                c_increment = -1
                n -= 1

            if c <= low_n:
                c += 1
                r -= 1
                r_increment = -1
                c_increment = 0
                m -= 1

            if r <= low_m:
                r += 1
                c += 1
                r_increment = 0
                c_increment = 1
                low_n += 1

        return result


def main():
    matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]]
    matrix_1 = [[1], [2], [3], [4]]
    res = Solution().spiralOrder(matrix=matrix_1)

    print(res)


if __name__ == "__main__":
    main()
