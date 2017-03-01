/**
 * https://www.hackerrank.com/challenges/bon-appetit
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
        int k = input.nextInt();
        int ck = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i==k)ck = input.nextInt();
            else sum += input.nextInt();
        }
        int p = input.nextInt();
        if(p == sum/2)System.out.println("Bon Appetit");
        else System.out.println(p - sum/2);
    }
}