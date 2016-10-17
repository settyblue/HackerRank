/**
 * https://www.hackerrank.com/challenges/runningtime
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
            int[] A = new int[n];
            for(int j=0; j<n; j++){
                A[j] = input.nextInt();
            }
            int[] leftSum = new int[n];
            leftSum[0] = 0;
            
            for(int j=1; j<n; j++){
                leftSum[j] = leftSum[j-1]+A[j-1];
            }
            
            int rightSum = 0;
            boolean done = false;
            for(int j=n-1; j>=0; j--){
                if(rightSum == leftSum[j]){
                    System.out.println("YES");
                    done = true;
                    break;
                }
                rightSum += A[j];
            }
            if(!done)System.out.println("NO");
        }
    }
}