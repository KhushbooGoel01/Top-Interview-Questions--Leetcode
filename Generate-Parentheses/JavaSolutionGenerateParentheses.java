/* https://leetcode.com/problems/generate-parentheses/ */

class Solution {
    
    public List<String> generateParenthesis(int n) 
    {
        List<String> list = new ArrayList<>();
        backtrack(n,0,0,list,"");
        return list;
    }
    void backtrack(int n , int open,int close, List<String> list,String s){
        if(s.length()==2*n){
            list.add(s);
            return;
        }if(open<n) backtrack(n,open+1,close,list,s+"(");
        if(close<open) backtrack(n,open,close+1,list,s+")");
    }
}
