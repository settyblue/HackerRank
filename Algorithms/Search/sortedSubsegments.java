/**
 * https://www.hackerrank.com/challenges/sorted-subsegments
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
        int q = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        for(int i=0; i<q; i++){
            int r = input.nextInt();
            int s = input.nextInt();
            Arrays.parallelSort(array,r,s+1);
        }
        //System.out.println(Arrays.toString(array));
        System.out.println(array[k]);
    }
}