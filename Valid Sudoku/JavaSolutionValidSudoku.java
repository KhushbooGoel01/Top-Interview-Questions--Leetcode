class Solution {
    public boolean isValidSudoku(char[][] board) {
        int countHor[][]=new int[10][10];
        int countVer[][]=new int[10][10];
        int countBox[][]=new int[10][10];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='.') continue;
                int value=Integer.parseInt(String.valueOf(board[i][j]));
                if(countHor[i][value]==1) return false;
                else countHor[i][value]++;
                if(countVer[j][value]==1) return false;
                else countVer[j][value]++;
                int box=j/3;
                if(i>2 && i<6) box+=3;
                else if(i>=6) box+=6;
                if(countBox[box][value]==1) return false;
                else countBox[box][value]++;
               //  System.out.println(i+" "+j+" "+box+" "+value);
            }
        }
        return true;            
    }
}