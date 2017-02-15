/**
 * https://www.hackerrank.com/challenges/apple-and-orange
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
        int T = input.nextInt();
        for(int t=0;t<T;t++){
            int n = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();
            if((m+s-1)%n == 0){
                System.out.println(n);
            }else{
                System.out.println((m+s-1)%n);
            }
        }
    }
}