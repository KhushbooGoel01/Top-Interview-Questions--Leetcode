Problem Link: https://leetcode.com/problems/spiral-matrix/

public List<Integer> spiralOrder(int[][] matrix) {
        int minR=0,minC=0;
        int maxR=matrix.length-1;
        int maxC=matrix[0].length-1;
        int count=0;
        int total=matrix.length*matrix[0].length;
        List<Integer> spiralTraversal=new ArrayList<>();
        
        while(count<total){
            //upRow
            for(int i=minR,j=minC;j<=maxC && count<total;j++){
                spiralTraversal.add(matrix[i][j]);
                count++;
            }
            minR++;
            
            for(int i=minR,j=maxC;i<=maxR && count<total;i++){
                spiralTraversal.add(matrix[i][j]);
                count++;
            }
            maxC--;
            
            for(int i=maxR,j=maxC;j>=minC && count<total;j--){
                spiralTraversal.add(matrix[i][j]);
                count++;
            }
            maxR--;
            
            for(int i=maxR,j=minC;i>=minR && count<total;i--){
                spiralTraversal.add(matrix[i][j]);
                count++;
            }
            minC++;
            
        }
        return spiralTraversal;
    }

