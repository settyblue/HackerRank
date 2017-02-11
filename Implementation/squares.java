/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares
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
        int T = input.nextInt();
        for(int t=0;t<T;t++){
            int a = input.nextInt();
            int b = input.nextInt();
            int low = (int)Math.sqrt(a*1.0);
            int high = (int)Math.sqrt(b*1.0);
            int answer = high-low;
            if(low*low == a)answer++;
            System.out.println(answer);
        }
    }
}