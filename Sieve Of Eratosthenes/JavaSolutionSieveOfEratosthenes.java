/*
Question link: https://leetcode.com/problems/count-primes/
Question: Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number. 
For ex:
input: n = 50
output: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47.
*/

import java.util.*;
//to print all primes upto n
public class SieveOfEratosthenes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //to store the limit

        boolean[] check = new boolean[n+1];
        Arrays.fill(check,true); //It will first assign all the indexes in the array with true

        for(int i = 2;i*i<check.length;i++){ 
          //it will check if multiple of any number is present in the range it will set all those indexes in the array to false
            if(check[i]==true){
                for(int j = i+i;j<check.length;j+=i){
                    check[j] = false;
                }
            }
        }

        for(int i = 2;i<check.length;i++){
          //only the indexes which are still true will be prime and we will print them
            if(check[i]==true){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}