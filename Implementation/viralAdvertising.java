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

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cur = 5;
        int answer = 0;
        for(int i=0;i<n;i++){
            cur = cur/2;
            answer = answer + cur;
            cur = cur*3;
        }
        System.out.println(answer);
    }
}