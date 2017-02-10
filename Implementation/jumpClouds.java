/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited
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
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        int answer = 100;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int curCloud = 0;
        for(int i=0;i<n/k;i++){
            answer--;
            if(c[(curCloud+k)%n] == 1)answer = answer-2;
            curCloud +=k;
        }
        System.out.println(answer);
    }
}
