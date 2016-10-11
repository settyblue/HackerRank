/**
 * https://www.hackerrank.com/challenges/maximizing-xor
 */


/**
 * @author rakshith
 *
 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max = 0;
        for(int i=a; i<= b; i++){
            for(int j=a; j<= b; j++){
                max = Math.max(max, i^j);
            }
        }
        System.out.println(max);
    }
}