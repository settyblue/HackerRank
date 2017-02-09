/**
 * https://www.hackerrank.com/challenges/maxsubarray
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
            int maxNonContSum = 0;
            int maxValue = Integer.MIN_VALUE;
            
            int maxEndingHere = 0;
            int maxSoFar = 0;
            for(int j=0; j<n; j++){
                array[j] = input.nextInt();
                if(array[j] > 0) maxNonContSum += array[j];
                maxValue = Math.max(maxValue, array[j]);
                maxEndingHere += array[j];
                if(maxEndingHere < 0) maxEndingHere = 0;
                if(maxSoFar < maxEndingHere) maxSoFar = maxEndingHere;
            }
            if(maxNonContSum == 0){
                maxNonContSum = maxValue;
            }
            
            int maxContSum = maxSoFar;
            
            if(maxContSum == 0){
                maxContSum = maxValue;
            }
            
            System.out.println(maxContSum+" "+maxNonContSum);
        }
    }
}