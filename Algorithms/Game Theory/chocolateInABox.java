/**
 * https://www.hackerrank.com/challenges/chocolate-in-box
 * 
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
        int[] a = new int[n];
        
        int p = 0;
        
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
            p = p^a[i];
        }
        
        int count = 0;
        for(int i=0; i<n; i++){
            if((p^a[i]) < a[i])count++;
        }
        
        System.out.println(count);
    }
}