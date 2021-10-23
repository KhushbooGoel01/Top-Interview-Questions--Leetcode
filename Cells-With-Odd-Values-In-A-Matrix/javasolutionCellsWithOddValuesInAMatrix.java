// Question Link : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
package com.shrey;

public class oddCells {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ar = new int[m][n];
        int count = 0;
        int r = 0;
        int c = 0;
        for(int i=0; i<indices.length; i++) {
            r = indices[i][0];
            c = indices[i][1];
            for(int j=0; j<n; j++) {
                ar[r][j]++;
            }
            for(int j=0; j<m; j++) {
                ar[j][c]++;
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(ar[i][j]%2!=0) {
                    count++;
                }
            }
        }
        return count;
    }
}
