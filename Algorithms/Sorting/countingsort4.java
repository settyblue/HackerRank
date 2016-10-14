/**
 * https://www.hackerrank.com/challenges/countingsort4
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
        }
        countSort(ar,max,s);
    }
    
    public static void countSort(int[] ar, int max, String[] s){
        int[] count = new int[max];
        for(int i=0; i<ar.length; i++){
            count[ar[i]]++;
        }
        for(int i=1; i<max; i++){
            count[i] +=count[i-1];
        }
        String[] ans =  new String[ar.length];
        for(int i=ar.length-1; i>=0; i--){
            if(i>=ar.length/2)ans[count[ar[i]]-1] = s[i];
            else ans[count[ar[i]]-1] = "-";
            count[ar[i]]--;
        }
        printArray(ans);
    }
    
    public static void printArray(int[] ar){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void printArray(String[] s){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i]+" ");
        }
    }
}