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
        int n = input.nextInt();
        int[] sticks = new int[n];
        for(int i=0;i<n;i++){
            sticks[i] = input.nextInt();
        }
        Arrays.sort(sticks);
        int startStick = 0;
        int answer = 0;
        //int minLength = sticks[startStick];
        while(startStick>=0 && startStick<n){
            int nextStart = -1;
            int minLength = sticks[startStick];
            for(int i=startStick;i<n;i++){
                sticks[i] -= minLength;
                answer++;
                if(sticks[i] !=0 && nextStart<0){
                    nextStart = i;
                }
            }
            startStick = nextStart;
            System.out.println(answer);
            //System.out.println(Arrays.toString(sticks));
            answer = 0;
            //if(startStick<0)break;
        }
        
        
    }
}