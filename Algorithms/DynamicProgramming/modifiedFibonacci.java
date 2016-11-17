/**
 * https://www.hackerrank.com/challenges/fibonacci-modified
 */


/**
 * @author rakshith
 *
 */


import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long t1 = input.nextInt();
        long t2 = input.nextInt();
        int n = input.nextInt();
        ArrayList<BigInteger> list = new ArrayList<>(n);
        list.add(BigInteger.valueOf(t1));
        list.add(BigInteger.valueOf(t2));
        for(int i=2; i<n; i++){
            BigInteger b = list.get(i-2).add(list.get(i-1).multiply(list.get(i-1)));
            list.add(b);
        }
        System.out.println(list.get(n-1));
    }
}