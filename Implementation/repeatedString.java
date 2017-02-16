/**
 * https://www.hackerrank.com/challenges/repeated-string
 * 
 */

/**
 * @author rakshith
 *
 */
 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int size = s.length();
        int counta = 0;
        
        for(char c:s.toCharArray()){
            if(c=='a')counta++;
        }
        long q = n/size;
        long answer = q*counta;
        long r = n%size;
        for(int i=0;i<r;i++){
            if(s.charAt(i)=='a')answer++;
        }
        System.out.println(answer);
    }
}
