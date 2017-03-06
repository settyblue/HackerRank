/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 * 
 */

/**
 * @author rakshith
 *
 */
 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=input.nextInt();
        int j=input.nextInt();
        int k=input.nextInt();
        int answer=0;
        for(int p=i; p<=j; p++){
            int n = p;
            int reverse=0;
            while(n>0){
                reverse=reverse*10+(n%10);
                n/=10;
            }
            if(Math.abs(reverse-p)%k==0)
                answer++;
        }
        System.out.println(answer);
    }
}