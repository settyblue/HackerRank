/**
 * https://www.hackerrank.com/challenges/quicksort1
 */


/**
 * @author rakshith
 *
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = input.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        
        int value = ar[0];
        int l=0, r=0, c=1;
        for(int i=1; i<n; i++){
            if(ar[i] > value){
                right[r++] = ar[i];
            }else if(ar[i] < value){
                left[l++] = ar[i];
            }else{
                c++;
            }
        }
        
        for(int i=0; i<l; i++){
            System.out.print(left[i]+" ");
        }
        for(int i=0; i<c; i++){
            System.out.print(value+" ");
        }
        for(int i=0; i<r; i++){
            System.out.print(right[i]+" ");
        }
    }
}