/**
 * https://www.hackerrank.com/challenges/utopian-tree
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
        for(int t=0; t<T; t++){
            int n = input.nextInt();
            int answer = 1;
            for(int i=0;i<n;i++){
                if(i%2==0)answer = answer*2;
                else answer++;
            }
            System.out.println(answer);
        }
    }
}