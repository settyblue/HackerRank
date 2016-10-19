/**
 * https://www.hackerrank.com/challenges/count-luck
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
        int T = input.nextInt();
        for(int t=0; t<T; t++){
            int m = input.nextInt();
            int n = input.nextInt();
            int[][] A = new int[m][n];
            int starti = 0,startj = 0;
            for(int i=0; i<m; i++){
                String s = input.next();
                for(int j=0; j<n; j++){
                    if(s.charAt(j)=='X'){
                        A[i][j] = 1;
                    }else if(s.charAt(j)=='M'){
                        A[i][j] = 1;
                        starti = i; startj = j;
                    }else if(s.charAt(j)=='*'){
                        A[i][j] = 2;
                    }
                }
            }
            int k = input.nextInt();
            int ans = start(A,starti,startj, m, n, 0);
            if(k!=ans){
                System.out.println("Oops!");
            }else{
                System.out.println("Impressed");
            }
        }
    }
    
    public static int start(int[][] A, int i, int j, int m, int n, int kSoFar){
        if(A[i][j] == 2)return kSoFar;
        A[i][j] = 1;
        boolean left=false, right=false, up=false, down=false;
        if(i-1>=0 && (A[i-1][j]==0 || A[i-1][j]==2))up = true;
        if(i+1<m  && (A[i+1][j]==0 || A[i+1][j]==2))down = true;
        if(j-1>=0 && (A[i][j-1]==0 || A[i][j-1]==2))left = true;
        if(j+1<n  && (A[i][j+1]==0 || A[i][j+1]==2))right = true;
        
        if(!up && !down && !left && !right)return 0;
        if(!up && !down && !left && right){
            return start(A,i,j+1,m,n,kSoFar);
        }
        if(!up && !down && left && !right){
            return start(A,i,j-1,m,n,kSoFar);
        }
        if(!up && down && !left && !right){
            return start(A,i+1,j,m,n,kSoFar);
        }
        if(up && !down && !left && !right){
            return start(A,i-1,j,m,n,kSoFar);
        }
        int returnValue = 0;
        if(right) returnValue += start(A,i,j+1,m,n,kSoFar+1);
        if(left) returnValue += start(A,i,j-1,m,n,kSoFar+1);
        if(up) returnValue += start(A,i-1,j,m,n,kSoFar+1);
        if(down) returnValue += start(A,i+1,j,m,n,kSoFar+1);
    
        return returnValue;
    }
    
}