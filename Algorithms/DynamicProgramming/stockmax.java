/**
 * https://www.hackerrank.com/challenges/stockmax
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
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            int[] array = new int[n];
            for(int j=0; j<n; j++){
                array[j] = input.nextInt();
            }
            int maxSoFar = 0;
            long profit = 0;
            for(int j=n-1; j>=0; j--){
                maxSoFar = Math.max(maxSoFar, array[j]);
                profit += maxSoFar - array[j];
            }
            System.out.println(profit);
        }
    }
}