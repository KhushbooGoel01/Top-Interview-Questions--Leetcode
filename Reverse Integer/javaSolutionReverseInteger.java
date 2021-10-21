//HERE I ADDED COMMENTS TO INCREASE THE READABILTIY OF CODE
//BY THE USERS

class Solution {
    public int reverse(int x) {
        int rev = 0;//HERE WE INITIALIZE THE VARIABLE WITH MINIUM VALUE 0
        while(x != 0){
            int r = x % 10;  //HERE VARIABLE r STORES THE REMAINDER 
            x /= 10;
            if(rev < Integer.MIN_VALUE/10) return 0;
            if(rev > Integer.MAX_VALUE/10) return 0;
            rev = rev * 10 + r; //MAIN CODE TO REVERSE THE INTEGER
        }
        return rev;
    }
}