/**
 * https://www.hackerrank.com/challenges/find-digits
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
        Scanner input= new Scanner(System.in);
        int T = input.nextInt();
        for(int t=0;t<T;t++){
            int n = input.nextInt();
            int p = n;
            int count = 0;
            
            while(p>0){
                int k = p%10;
                if(k!=0 && n%k==0)count++;
                p = p/10;
            }
            System.out.println(count);
        }
    }
}