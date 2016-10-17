/**
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid
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
        int[][] A = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println(largestIsland(A));
    }
    
    public static int largestIsland(int[][] A){
        int maxValue = Integer.MIN_VALUE;
        int m = A.length;
        int n = A[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(A[i][j] == 1){
                    maxValue = Math.max(maxValue, visit(A,i,j,m,n));
                }
            }
        }
        return maxValue;
    }
    
    public static int visit(int[][] A, int i, int j, int m, int n){
        if(i>=0 && i<m && j>=0 && j<n && A[i][j] == 1){
            A[i][j] = 2;
            return 1 + visit(A,i+1,j,m,n) + visit(A,i,j+1,m,n) + visit(A,i-1,j,m,n) + visit(A,i,j-1,m,n) + visit(A,i+1,j+1,m,n) + visit(A,i-1,j+1,m,n) + visit(A,i-1,j-1,m,n) + visit(A,i+1,j-1,m,n);
        }else{
            return 0;
        }
    }
}