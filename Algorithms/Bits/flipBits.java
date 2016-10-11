/**
 * https://www.hackerrank.com/challenges/flipping-bits
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
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = Integer.parseUnsignedInt(input.next());
            int p = 1;
            int j = 0;
            while(j<32){
                n = n ^ p;
                p = p << 1;
                j++;
            }
            System.out.println(Integer.toUnsignedString(n));
        }
    }
}