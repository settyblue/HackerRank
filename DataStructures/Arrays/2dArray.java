/**
 * https://www.hackerrank.com/challenges/2d-array
 */


/**
 * @author rakshith
 *
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[6][6];
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                array[i][j] = scan.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE,sum = 0;
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
                sum = array[i][j]
                    +array[i-1][j-1]+array[i-1][j]+array[i-1][j+1]
                    +array[i+1][j-1]+array[i+1][j]+array[i+1][j+1];
                maxSum = Math.max(maxSum,sum);
            }
        }
        
        System.out.print(maxSum);
    }
}