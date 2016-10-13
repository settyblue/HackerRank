/**
 * https://www.hackerrank.com/challenges/countingsort2
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
        int max = 0;
        for(int i=0; i<n; i++){
            ar[i]  = input.nextInt();
            max = Math.max(max,ar[i]);
        }
        countSort(ar,max+1);
    }
    
    public static void countSort(int[] ar, int n){
        int[] count = new int[n];
        for(int i=0; i<ar.length; i++){
            count[ar[i]]++;
        }
        //printArray(count);
        printCountArray(count);
    }
    
    public static void printArray(int[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    
    public static void printCountArray(int[] ar){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[i]; j++){
                System.out.print(i+" ");
            }
        }
    }
}