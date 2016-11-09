/**
 * https://www.hackerrank.com/contests/university-codesprint/challenges/mini-max-sum
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
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long min = Math.min(a,b); min = Math.min(min,c); min = Math.min(min,d); min = Math.min(min,e);
        long max = Math.max(a,b); max = Math.max(max,c); max = Math.max(max,d); max = Math.max(max,e);
        long sum = a + b + c + d + e;
        
        System.out.println((sum-max)+" "+(sum-min));
    }
}