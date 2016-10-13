/**
 * https://www.hackerrank.com/challenges/countingsort3
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
        int[] ar = new int[n];
        String[] s = new String[n];
        int max = 100;
        for(int i=0; i<n; i++){
            ar[i]  = input.nextInt();
            s[i] = input.next();
            //max = Math.max(max,ar[i]);
        }
        countSort(ar,max);
    }
    
    public static void countSort(int[] ar, int max){
        int[] count = new int[max];
        for(int i=0; i<ar.length; i++){
            count[ar[i]]++;
        }
        for(int i=1; i<max; i++){
            count[i] +=count[i-1];
        }
        printArray(count);
    }
    
    public static void printArray(int[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}