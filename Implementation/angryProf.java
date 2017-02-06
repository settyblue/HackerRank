/**
 * https://www.hackerrank.com/challenges/angry-professor
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
        for(int t=0; t<T; t++){
            int n = input.nextInt();
            int k = input.nextInt();
            int count = 0;
            for(int i=0;i<n;i++){
                if(input.nextInt() <= 0)count++;
            }
            if(count>=k)System.out.println("NO");
            else System.out.println("YES");
        }
    }
}