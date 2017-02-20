/**
 * https://www.hackerrank.com/challenges/powers-game-1
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
        StringBuilder answer = new StringBuilder();
        for(int t=0; t<T; t++){
            int n = input.nextInt();
            if((n&7)==0){
                answer.append("Second\n");
            }else{
                answer.append("First\n");
            }
        }
        System.out.println(answer);
    }
}