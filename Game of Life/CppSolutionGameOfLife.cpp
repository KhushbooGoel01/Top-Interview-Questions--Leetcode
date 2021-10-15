# Question Link: https://leetcode.com/problems/game-of-life/

class Solution {
public:
    vector<vector<int>>board;
    int r,c;
    int getl(int i,int j){
        int l=0;
        if(i+1<r && board[i+1][j])l++;
        if(i+1<r && j+1<c && board[i+1][j+1])l++;
        if(j+1<c && board[i][j+1])l++;
        if(i-1>=0 && board[i-1][j])l++;
        if(i-1>=0 && j-1>=0 && board[i-1][j-1])l++;
        if(j-1>=0 && board[i][j-1])l++;
        if(i+1<r && j-1>=0 && board[i+1][j-1])l++;
        if(i-1>=0 && j+1<c && board[i-1][j+1])l++;
        return l;
    }
    void gameOfLife(vector<vector<int>>& t) {
        board=t;
        r=board.size();c=board[0].size();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){                
                int l=getl(i,j);
                if(board[i][j]) t[i][j]=(l==2 || l==3)?1:0;
                else t[i][j]= l==3?1:0;
            }
        return;
    }
};