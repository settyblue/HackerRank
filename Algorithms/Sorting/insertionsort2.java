/**
 * https://www.hackerrank.com/challenges/insertionsort2
 */


/**
 * @author rakshith
 *
 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {       
        int len = ar.length;
        for(int j=1; j<len; j++){
            int e = ar[j];
            boolean placed = false;
            for(int i=j-1; i>=0; i--){
                if(ar[i] > e){
                    ar[i+1] = ar[i];
                }else{
                    ar[i+1] = e;
                    printArray(ar);
                    placed = true;
                    break;
                }
            }
            if(!placed){
                ar[0] = e;
                printArray(ar);
            }
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
