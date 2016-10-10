/**
 * https://www.hackerrank.com/challenges/sum-vs-xor
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
        long n = in.nextLong();
        long x = n;
        int count = 0;
        while(x > 0){
            if((x & 1) == 0)count++;
            x = x >> 1;
        }
        System.out.print(1 << count);
    }
}
