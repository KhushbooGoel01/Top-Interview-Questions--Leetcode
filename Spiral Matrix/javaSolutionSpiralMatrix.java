// Problem Link: https://leetcode.com/problems/spiral-matrix/

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) {
            return result;
        }
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return result;
    }
}



// public List<Integer> spiralOrder(int[][] matrix) {
//         int minR=0,minC=0;
//         int maxR=matrix.length-1;
//         int maxC=matrix[0].length-1;
//         int count=0;
//         int total=matrix.length*matrix[0].length;
//         List<Integer> spiralTraversal=new ArrayList<>();
        
//         while(count<total){
//             //upRow
//             for(int i=minR,j=minC;j<=maxC && count<total;j++){
//                 spiralTraversal.add(matrix[i][j]);
//                 count++;
//             }
//             minR++;
            
//             for(int i=minR,j=maxC;i<=maxR && count<total;i++){
//                 spiralTraversal.add(matrix[i][j]);
//                 count++;
//             }
//             maxC--;
            
//             for(int i=maxR,j=maxC;j>=minC && count<total;j--){
//                 spiralTraversal.add(matrix[i][j]);
//                 count++;
//             }
//             maxR--;
            
//             for(int i=maxR,j=minC;i>=minR && count<total;i--){
//                 spiralTraversal.add(matrix[i][j]);
//                 count++;
//             }
//             minC++;
            
//         }
//         return spiralTraversal;
//     }

