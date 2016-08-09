/**
 * https://www.hackerrank.com/challenges/flipping-the-matrix
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
        int Q = input.nextInt();
        for(int q=0; q<Q; q++){
            int n = input.nextInt();
            int[][] array = new int[2*n][2*n];
            //int[] answer = new int[n][n];
            int sum = 0;
            for(int i=0; i<2*n; i++){
                for(int j=0; j<2*n; j++){
                    array[i][j] = input.nextInt();
                }
            }
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum = sum + Math.max(array[i][j], Math.max(array[i][2*n-1-j], 
                                                               Math.max(array[2*n-1-i][j], array[2*n-1-i][2*n-1-j])));
                }
            }
            
            System.out.println(sum);
        }
    }
}