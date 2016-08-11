/**
 * https://www.hackerrank.com/challenges/new-year-chaos
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
            int[] array = new int[n];
            for(int i=0; i<n; i++){
                array[i] = input.nextInt()-1;
            }
            int answer = 0;
            boolean done = false;
            for(int i=0; i<n; i++){
                if(array[i]-i > 2){
                    System.out.println("Too chaotic");
                    done = true;
                    break;
                }
                /*
                for(int j=n-1;j>i;j--){
                    if(array[j]<array[i])answer++;
                }*/
                for (int j = Math.max(0, array[i] - 2); j < i; j++)
                    if (array[j] > array[i]) answer++;
                //System.out.println(i+" "+answer);
            }
            if(!done)System.out.println(answer);
        }
    }
}