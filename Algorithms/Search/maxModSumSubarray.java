/**
 * https://www.hackerrank.com/challenges/maximum-subarray-sum
 * having some issues.
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
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            long m = input.nextLong();
            long[] A = new long[n];
            for(int j=0; j<n; j++){
                A[j] = input.nextLong();
            }
            System.out.println(computeMaxModSum(A,m));
        }
    }
    
    public static long computeMaxModSum(long[] A, long m){
        int n = A.length;
        long[] prefixSum = new long[n];
        long cur = 0;
        TreeSet<Long> set = new TreeSet<Long>();
        long minValue = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            cur = (cur+A[i])%m;
            prefixSum[i] = cur;
            minValue = Math.min(minValue,m-cur);
            if(set != null && !set.tailSet(cur,false).isEmpty()){
                long temp = set.tailSet(cur,false).first();
                minValue = Math.min(minValue,temp-cur);
            }
            set.add(cur);
            if(minValue == 1){return m-minValue;}
        }
        return m-minValue;
    }
}