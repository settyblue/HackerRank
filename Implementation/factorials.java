/**
 * https://www.hackerrank.com/challenges/extra-long-factorials
 * 
 */

/**
 * @author rakshith
 *
 */
 
import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger bg = new BigInteger("1");
        for(int i=2;i<n+1;i++){
            bg = bg.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(bg.toString());
    }
}