/**
 * https://www.hackerrank.com/challenges/dynamic-programming-classics-the-longest-common-subsequence
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
        int m = input.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for(int i=0; i<n; i++){
            a1[i] = input.nextInt();
        }
        for(int i=0; i<m; i++){
            a2[i] = input.nextInt();
        }
        lcs(a1,a2);
    }
    
    public static void lcs(int[] a1, int[] a2){
        int n = a1.length;
        int m = a2.length;
        int[][] max = new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a1[i-1] == a2[j-1]){
                    max[i][j] = max[i-1][j-1]+1;//Math.max(Math.max(max[i-1][j-1]+1, max[i][j-1]), max[i-1][j]);
                }else{
                    max[i][j] = Math.max(max[i-1][j], max[i][j-1]);
                }
            }
        }
        int maxLen = max[n][m];
        int index = maxLen;
        int[] result = new int[maxLen];
        int p = n, q= m;
        while(p > 0 && q > 0){
            if(a1[p-1] == a2[q-1]){
                result[index-1] = a1[p-1];
                index--;p--;q--;
            }else if(max[p-1][q] > max[p][q-1]){
                p--;
            }else{
                q--;
            }
        }
        for(int i=0; i<maxLen; i++){
            System.out.print(result[i]+" ");
        }
        //print(max);
    }
    
    public static void print(int[][] max){
        for(int i=0; i<max.length; i++){
            for(int j=0; j<max[0].length; j++){
                System.out.print(max[i][j]+" ");
            }
            System.out.println();
        }
    }
}