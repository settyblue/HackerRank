/**
 * https://www.hackerrank.com/contests/university-codesprint/challenges/kindergarten-adventures
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
        int[] t = new int[n];
        int[] count = new int[n];
        for(int i=0; i<n; i++){
            t[i] = input.nextInt();
            for(int j=i+1; j<(n-t[i]+i+1); j++){
                count[j%n]++;
            }
        }
        int maxIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(maxValue < count[i]){
                maxValue = count[i];
                maxIndex = i;
            }
        }
        
        System.out.println(maxIndex+1);
    }
}