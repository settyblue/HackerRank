/**
 * https://www.hackerrank.com/challenges/apple-and-orange
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
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int counta = 0;
        int countb = 0;
        long x = s-a, y = t-a;
        long u = s-b, v = t-b;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            if(apple[apple_i] >= x && apple[apple_i] <= y)counta++;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(orange[orange_i] >= u && orange[orange_i] <= v)countb++;
        }
        System.out.println(counta+"\n"+countb);
    }
}
