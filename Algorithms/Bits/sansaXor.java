/**
 * https://www.hackerrank.com/challenges/sansa-and-xor
 */


/**
 * @author rakshith
 *
 */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            if(n%2==0){
                for(int j=0; j<n; j++){
                    input.nextInt();
                }
                System.out.println("0");
                continue;
            }    
            int ans = 0;
            for(int j=0; j<n; j++){
                if(j%2==0)ans =ans ^ input.nextInt();
                else {
                    int temp = input.nextInt();
                }
            }
            System.out.println(ans);
        }
    }
}