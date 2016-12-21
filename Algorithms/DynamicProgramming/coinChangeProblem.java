/**
 * https://www.hackerrank.com/challenges/coin-change
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
        int[] c = new int[m];
        for(int i=0; i<m; i++){
            c[i] = input.nextInt();
        }
        long[][] count = new long[m][n+1];
        for(int i=0;i<m;i++){
            count[i][0] = 1;
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n+1;j++){
                long tempCount = 0;
                int k = 1;
                while(true){
                    if(i==0)break;
                    if(j-k*c[i] < 0)break;
                    tempCount += count[i-1][j-k*c[i]];
                    k++;
                }
                if(i==0){
                    if(j%c[i]==0)count[i][j] = 1;
                    continue;
                }
                count[i][j] = count[i-1][j] + tempCount;
            }
        }
        //print(count);
        System.out.println(count[m-1][n]);
    }
    
    public static void print(long[][] array){
        int m = array.length;
        int n = array[0].length;
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}