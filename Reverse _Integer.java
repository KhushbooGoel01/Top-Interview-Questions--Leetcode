
// Reverse Integer : https://leetcode.com/problems/reverse-integer/

public int reverse(int input) {
        int reverse = 0 ;
        int pop;
        
        while(input != 0){
            
            pop = input % 10;
            input /= 10;
            
            if(reverse > Integer.MAX_VALUE /10){
                return 0;
            }
            
            if(reverse < Integer.MIN_VALUE /10){
                return 0;
            }
            
            reverse = (reverse * 10) + pop;  
        }
        

      return reverse;    
        
    }
