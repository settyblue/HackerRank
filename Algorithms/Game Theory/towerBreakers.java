/**
 * https://www.hackerrank.com/challenges/tower-breakers-1
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
        int t = input.nextInt();
        for(int i=0; i<t; i++){
            int n = input.nextInt();
            int m = input.nextInt();
            if(m==1){
                System.out.println(2);
                continue;
            }
            if(n%2 == 0){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}