/**
 * https://www.hackerrank.com/challenges/bob-and-ben
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
        int G = input.nextInt();
        for(int g=0; g<G; g++){
            int n = input.nextInt();
            int p = 0;
            for(int i=0; i<n; i++){
                int m = input.nextInt();
                int k = input.nextInt();
                if(m%2 == 1){
                    p = p^1;
                }else if(m > 2){
                    p = p^2;
                }
            }
            if(p==0){
                System.out.println("BEN");
            }else{
                System.out.println("BOB");
            }
            //System.out.println(p);
        }
    }
}