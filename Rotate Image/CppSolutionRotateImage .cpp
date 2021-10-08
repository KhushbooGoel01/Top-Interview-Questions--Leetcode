// Question Link: https://leetcode.com/problems/rotate-image/


class Solution {
public:
    void rotate(vector<vector<int>>& image) {
		// transpose matrix
        for (int i = 0; i < image.size(); ++i) {
            for (int j = i; j < image.size(); ++j) {
                swap(image[i][j], image[j][i]);
            }
        }
		// reverse rows
        for (auto& row : image) reverse(row.begin(), row.end());
    }
};
