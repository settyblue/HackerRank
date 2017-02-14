/**
 * https://www.hackerrank.com/challenges/sock-merchant
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
        //int c[] = new int[n];
        int count[] = new int[100];
        for(int c_i=0; c_i < n; c_i++){
            //c[c_i] = 
            count[in.nextInt()-1]++;
        }
        int answer = 0;
        for(int i=0;i<100;i++){
            if(count[i]%2==0) answer += count[i]/2;
            else answer += (count[i]-1)/2;
        }
        System.out.println(answer);
    }
}
