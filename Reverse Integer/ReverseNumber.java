// This program can handle both +ve & -ve numbers

import java.util.Scanner;

public class ReverseNumber{

    private static int reverse(int N){
        int result = 0; // storing reverse result
        boolean sign = true; // determine +ve or -ve number
        if(N < 0){
            sign = false;
            N = -N;
        }

        while(N > 0){
            result = result * 10 + N % 10;
            N /= 10;
        }

        return sign == true ? result : -result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        System.out.println(reverse(N));
    }
}