/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */


/**
 * @author rakshith
 *
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int len = ar.length;
        int e = ar[len-1];
        for(int i=len-2; i>=0; i--){
            if(ar[i] > e){
                ar[i+1] = ar[i];
                printArray(ar);
            }else{
                ar[i+1] = e;
                printArray(ar);
                return;
            }
        }
        ar[0] = e;
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
