/**
 * https://www.hackerrank.com/challenges/the-love-letter-mystery
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
        int n = input.nextInt();
        for(int i=0; i<n; i++){
            String s = input.next();
            int l = s.length();
            int cost = 0;
            for(int j=0; j<l/2; j++){
                if(s.charAt(j) != s.charAt(l-1-j)){
                    cost += Math.abs(s.charAt(j) - s.charAt(l-1-j));
                }
            }
            System.out.println(cost);
        }
    }
}